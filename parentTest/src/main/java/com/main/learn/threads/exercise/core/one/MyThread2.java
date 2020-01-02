package com.main.learn.threads.exercise.core.one;

/**
 * @author sunlei19
 * @Description TODO
 * @Date 2019/12/27 13:56
 */
public class MyThread2 extends Thread {
    @Override
    public void run() {
        try {
            Thread.sleep(5000);
            System.out.println("thread-2");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
