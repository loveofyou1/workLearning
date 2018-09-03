package com.main.threads.artOfThread.thread05;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author Dean
 * @create 2018/9/3
 */
public class LockOne {
    static Lock lock1 = new ReentrantLock();


    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            try {
                //main线程获取锁后睡眠，导致获取锁失败，释放锁报错
                if (lock1.tryLock()) {
                    System.out.println(System.currentTimeMillis() + "=====3");
                    System.out.println("lock1 tryLock test");
                } else {
                    System.out.println("lock1 tryLock fail.");
                }
            } finally {
                System.out.println(System.currentTimeMillis() + "=====4");
                lock1.unlock();
            }
        });
        thread.start();
        lock1.lock();
        try {
            //main线程获取锁成功后先睡眠100millis
            //SleepUtil.sleep(100);
            System.out.println(System.currentTimeMillis() + "======1");
            System.out.println("main lock1 test.");
        } finally {
            System.out.println(System.currentTimeMillis() + "======2");
            lock1.unlock();
        }

    }


}
