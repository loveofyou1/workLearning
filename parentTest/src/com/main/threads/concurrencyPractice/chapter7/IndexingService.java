package com.main.threads.concurrencyPractice.chapter7;

import java.io.File;
import java.io.FileFilter;
import java.util.concurrent.BlockingQueue;

/**
 * @author sunlei19
 * @create 2018-03-19 17:07
 */
public class IndexingService {
    /**
     * 毒丸
     */
    private static final File POISON = new File("");
    private final IndexerThread consumer = new IndexerThread();
    private final CrewlerThread producer = new CrewlerThread();
    private final BlockingQueue<File> queue;
    private final FileFilter fileFilter;
    private final File root;

    public IndexingService(BlockingQueue<File> queue, FileFilter fileFilter, File root) {
        this.queue = queue;
        this.fileFilter = fileFilter;
        this.root = root;
    }

    public void start() {
        producer.start();
        consumer.start();
    }

    public void stop() {
        producer.interrupt();
    }

    public void awaitTermination() throws InterruptedException {
        consumer.join();
    }

    private class IndexerThread extends Thread {
        public void run() {
            try {
                while (true) {
                    File file = queue.take();
                    if (file == POISON) {
                        break;
                    } else {

                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private class CrewlerThread extends Thread {
        public void run() {
            try {
                crawl(root);
            } catch (InterruptedException e) {
                //发生异常
            } finally {
                while (true) {
                    try {
                        queue.put(POISON);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                        //重新尝试
                    }
                }
            }
        }

        private void crawl(File root) throws InterruptedException {
        }
    }
}
