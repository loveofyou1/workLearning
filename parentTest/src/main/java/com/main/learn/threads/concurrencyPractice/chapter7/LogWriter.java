package com.main.learn.threads.concurrencyPractice.chapter7;

import java.io.PrintWriter;
import java.util.concurrent.BlockingQueue;

/**
 * 不支持关闭的生产者-消费者日志服务
 *
 * @author sunlei19
 * @create 2018-03-19 16:35
 */
public class LogWriter {
    private final BlockingQueue<String> queue;
    private final LoggerThread logger;

    public LogWriter(BlockingQueue<String> queue, LoggerThread logger) {
        this.queue = queue;
        this.logger = logger;
    }

    public void start() {
        logger.start();
    }

    public void log(String msg) throws InterruptedException {
        queue.put(msg);
    }

    private class LoggerThread extends Thread {
        private final PrintWriter writer;

        private LoggerThread(PrintWriter writer) {
            this.writer = writer;
        }

        public void run() {
            try {
                while (true) {
                    writer.println(queue.take());
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                writer.close();
            }
        }
    }
}
