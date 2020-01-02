package com.main.learn.threads.exercise.core.three;

/**
 * @author sunlei19
 * @Description TODO
 * @Date 2020/1/1 09:16
 */
public class MyThread1 extends Thread {
    private Object lock;

    public MyThread1(Object lock) {
        super();
        this.lock = lock;
    }

    @Override
    public void run() {

        try {
            synchronized (lock) {
                long start = System.currentTimeMillis();
                System.out.println("开始  等待时间=" + start);
                lock.wait();
                System.out.println("结束  等待时间=" + (System.currentTimeMillis() - start));
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
