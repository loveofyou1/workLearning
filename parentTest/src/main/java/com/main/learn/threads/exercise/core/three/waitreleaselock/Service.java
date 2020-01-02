package com.main.learn.threads.exercise.core.three.waitreleaselock;

/**
 * @author sunlei19
 * @Description TODO
 * @Date 2020/1/1 09:57
 */
public class Service {
    public void methodObject(Object lock) {
        try {
            synchronized (lock) {
                System.out.println("begin wait ");
                lock.wait();
                System.out.println("end wait");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
