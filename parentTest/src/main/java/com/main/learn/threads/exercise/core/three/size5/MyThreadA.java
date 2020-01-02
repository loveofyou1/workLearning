package com.main.learn.threads.exercise.core.three.size5;

/**
 * @author sunlei19
 * @Description TODO
 * @Date 2020/1/1 09:37
 */
public class MyThreadA extends Thread {
    private Object lock = new Object();

    public MyThreadA(Object lock) {
        super();
        this.lock = lock;
    }

    @Override
    public void run() {
        try {
            synchronized (lock) {
                if (MyList.size() != 5) {
                    System.out.println("wait begin " + System.currentTimeMillis());
                    lock.wait();
                    System.out.println("wait end " + System.currentTimeMillis());
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
