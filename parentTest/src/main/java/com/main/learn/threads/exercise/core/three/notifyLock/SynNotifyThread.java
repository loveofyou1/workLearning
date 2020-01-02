package com.main.learn.threads.exercise.core.three.notifyLock;

/**
 * @author sunlei19
 * @Description TODO
 * @Date 2020/1/1 10:23
 */
public class SynNotifyThread extends Thread {

    private Object lock = new Object();

    public SynNotifyThread(Object lock) {
        super();
        this.lock = lock;
    }

    @Override
    public void run() {
        Service service = new Service();
        service.notifyMethod(lock);
    }
}
