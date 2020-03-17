package com.main.learn.threads.exercise.core.four.ConditionTestMoreMethod;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author sunlei19
 * @date 2020/1/2
 */
public class MyService {
    private Lock lock = new ReentrantLock();

    public void testMethodA() {
        try {
            lock.lock();
            System.out.println("testMethodA begin ThreadName=" + Thread.currentThread().getName()
                    + " time=" + System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("testMethodA end ThreadName=" + Thread.currentThread().getName()
                    + " time=" + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void testMethodB() {
        try {
            lock.lock();
            System.out.println("testMethodB begin ThreadName=" + Thread.currentThread().getName()
                    + " time=" + System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("testMethodB end ThreadName=" + Thread.currentThread().getName()
                    + " time=" + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
