package com.main.learn.threads.exercise.core.three.notifyLock;

/**
 * @author sunlei19
 * @Description TODO
 * @Date 2020/1/1 10:20
 */
public class ThreadB extends Thread {

    private Object lock = new Object();

    public ThreadB(Object lock) {
        super();
        this.lock = lock;
    }

    @Override
    public void run() {
        Service service = new Service();
        service.notifyMethod(lock);
    }
}
