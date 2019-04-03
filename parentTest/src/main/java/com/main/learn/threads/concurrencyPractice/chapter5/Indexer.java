package com.main.learn.threads.concurrencyPractice.chapter5;

import java.io.File;
import java.util.concurrent.BlockingQueue;

/**
 * @author sunlei19
 * @create 2019/3/26
 */
public class Indexer implements Runnable {

    private final BlockingQueue<File> queue;

    public Indexer(BlockingQueue<File> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            while (true) {
                indexFile(queue.take());
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }


    private void indexFile(File file) throws InterruptedException {
        if (file.isDirectory() || file.isFile()) {
            queue.put(file);
        }
    }
}
