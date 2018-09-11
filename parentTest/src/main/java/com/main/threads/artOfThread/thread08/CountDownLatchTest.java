package com.main.threads.artOfThread.thread08;

import com.main.threads.util.SleepUtil;

import java.util.concurrent.CountDownLatch;

/**
 * @author Dean
 * @create 2018/9/11
 */
public class CountDownLatchTest {
    static CountDownLatch countDownLatch = new CountDownLatch(2);


    public static void main(String[] args) throws InterruptedException {
        new Thread(() -> {
            SleepUtil.sleep(10);
            run1();
            countDownLatch.countDown();
        }, "thread1").start();
        new Thread(() -> {
            SleepUtil.sleep(10);
            run2();
            countDownLatch.countDown();
        }, "thread2").start();
        countDownLatch.await();
        System.out.println(Thread.currentThread().getName() + " run3");
    }


    static void run1() {
        System.out.println(Thread.currentThread().getName() + " run1");
    }


    static void run2() {
        System.out.println(Thread.currentThread().getName() + " run2");
    }
}
