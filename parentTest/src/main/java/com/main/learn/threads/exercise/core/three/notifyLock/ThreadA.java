package com.main.learn.threads.exercise.core.three.notifyLock;

/**
 * @author sunlei19
 * @Description TODO
 * @Date 2020/1/1 10:18
 */
public class ThreadA extends Thread {

    private Object lock = new Object();

    public ThreadA(Object lock) {
        super();
        this.lock = lock;
    }

    @Override
    public void run() {
        Service service = new Service();
        service.testMethod(lock);
    }
}
