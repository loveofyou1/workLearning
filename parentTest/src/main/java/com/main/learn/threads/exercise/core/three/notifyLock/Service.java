package com.main.learn.threads.exercise.core.three.notifyLock;

/**
 * @author sunlei19
 * @Description TODO
 * @Date 2020/1/1 10:02
 */
public class Service {
    public void testMethod(Object lock) {
        try {
            synchronized (lock) {
                System.out.println("begin wait() ThreadName=" + Thread.currentThread().getName());
                lock.wait();

                System.out.println("end wait() ThreadName=" + Thread.currentThread().getName());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void notifyMethod(Object lock) {
        try {
            synchronized (lock) {
                System.out.println("begin notify ThreadName=" + Thread.currentThread().getName() + " time=" + System.currentTimeMillis());
                lock.notify();
                System.out.println("end notify ThreadName=" + Thread.currentThread().getName() + " time=" + System.currentTimeMillis());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
