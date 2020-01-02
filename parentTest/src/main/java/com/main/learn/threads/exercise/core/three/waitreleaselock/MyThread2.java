package com.main.learn.threads.exercise.core.three.waitreleaselock;

/**
 * @author sunlei19
 * @Description TODO
 * @Date 2020/1/1 10:00
 */
public class MyThread2 extends Thread {
    private Object lock;

    public MyThread2(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        Service service = new Service();
        service.methodObject(lock);
    }
}
