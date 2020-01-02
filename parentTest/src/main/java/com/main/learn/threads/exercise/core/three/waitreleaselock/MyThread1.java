package com.main.learn.threads.exercise.core.three.waitreleaselock;

/**
 * @author sunlei19
 * @Description TODO
 * @Date 2020/1/1 09:59
 */
public class MyThread1 extends Thread {
    private Object lock;

    public MyThread1(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        Service service = new Service();
        service.methodObject(lock);
    }
}
