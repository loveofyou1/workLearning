package com.main.learn.threads.concurrencyPractice.chapter05;

import java.util.concurrent.CountDownLatch;

/**
 * 闭锁
 *
 * @author sunlei19
 * @create 2019/3/27
 */
public class TestHarness {

    public long timeTasks(int nThreads, final Runnable task) throws InterruptedException {
        final CountDownLatch startGate = new CountDownLatch(1);
        final CountDownLatch endGate = new CountDownLatch(nThreads);
        for (int i = 0; i < nThreads; i++) {
            Thread t = new Thread() {
                @Override
                public void run() {
                    try {
                        startGate.await();
                        try {
                            task.run();
                        } finally {
                            endGate.countDown();
                        }
                    } catch (InterruptedException ignore) {

                    }
                }
            };
            t.start();
        }
        long start = System.nanoTime();
        startGate.await();
        endGate.await();
        long end = System.nanoTime();
        return end - start;
    }

}
