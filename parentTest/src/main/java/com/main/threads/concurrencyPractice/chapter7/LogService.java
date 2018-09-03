package com.main.threads.concurrencyPractice.chapter7;

import net.jcip.annotations.GuardedBy;

import java.io.PrintWriter;
import java.util.concurrent.BlockingQueue;

/**
 * 为logWriter添加可靠的取消操作
 *
 * @author sunlei19
 * @create 2018-03-19 16:42
 * @see LogWriter
 */
public class LogService {
    private final BlockingQueue<String> queue;
    private final LoggerThread loggerThread;
    private final PrintWriter writer;
    @GuardedBy("this")
    private boolean isShutDown;
    @GuardedBy("this")
    private int reservation;

    public LogService(BlockingQueue<String> queue, LoggerThread loggerThread, PrintWriter writer) {
        this.queue = queue;
        this.loggerThread = loggerThread;
        this.writer = writer;
    }

    public void start() {
        loggerThread.start();
    }

    public void stop() {
        synchronized (this) {
            isShutDown = true;
        }
        /**取消操作*/
        loggerThread.interrupt();
    }

    public void log(String msg) throws InterruptedException {
        synchronized (this) {
            if (isShutDown) {
                throw new IllegalStateException(msg);
            }
            ++reservation;
        }
        queue.put(msg);
    }

    private class LoggerThread extends Thread {
        public void run() {
            try {
                while (true) {
                    try {
                        synchronized (LogService.this) {
                            if (isShutDown && reservation == 0) {
                                break;
                            }
                        }
                        String msg = queue.take();
                        synchronized (LogService.this) {
                            --reservation;
                        }
                        writer.println(msg);
                    } catch (InterruptedException e) {
                        /** retry */
                        e.printStackTrace();
                    }
                }
            } finally {
                writer.close();
            }
        }
    }
}
