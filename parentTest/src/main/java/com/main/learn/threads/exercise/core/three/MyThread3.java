package com.main.learn.threads.exercise.core.three;

/**
 * @author sunlei19
 * @Description TODO
 * @Date 2020/1/1 09:26
 */
public class MyThread3 extends Thread {

    private Object lock;

    public MyThread3(Object lock) {
        super();
        this.lock = lock;
    }

    @Override
    public void run() {
        synchronized (lock) {
            long start = System.currentTimeMillis();
            System.out.println("开始nofity time=" + start);
            lock.notifyAll();
            System.out.println("结束notify time=" + (System.currentTimeMillis() - start));
        }
    }
}
