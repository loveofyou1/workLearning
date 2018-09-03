package com.main.threads.concurrencyPractice.chapter11;

import java.util.concurrent.BlockingQueue;

/**
 * @author sunlei19
 * @create 2018-03-23 16:24
 */
public class WorderThread extends Thread {
    private final BlockingQueue<Runnable> queue;


    public WorderThread(BlockingQueue<Runnable> queue) {
        this.queue = queue;
    }

    public void run() {
        while (true) {
            try {
                Runnable task = queue.take();//queue.take()是串行执行
            } catch (InterruptedException e) {
                break;//允许退出系统
            }
        }
    }
}
