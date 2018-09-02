package com.main.threads.artOfThread.thread05;

import com.main.threads.util.SleepUtil;

import java.util.concurrent.locks.Lock;

/**
 * @author sunlei19
 * @create 2018-02-03 16:37
 */
public class TwinsLockTest {
    public static void main(String[] args) {
        final Lock lock = new TwinsLock();
        class Worker extends Thread {
            public void run() {
                while (true) {
                    lock.lock();
                    try {
                        SleepUtil.sleep(1);
                        System.out.println(Thread.currentThread().getName());
                        SleepUtil.sleep(1);
                    } finally {
                        lock.unlock();
                    }
                }
            }
        }
        //启动10个线程
        for (int i = 0; i < 10; i++) {
            Worker w = new Worker();
            w.setDaemon(true);
            w.start();
        }
        //每隔1秒换行
        for (int i = 0; i < 10; i++) {
            SleepUtil.sleep(1);
            System.out.println();
        }
    }
}
