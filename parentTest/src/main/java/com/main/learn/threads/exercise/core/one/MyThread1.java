package com.main.learn.threads.exercise.core.one;

/**
 * @author sunlei19
 * @Description TODO
 * @Date 2019/12/27 13:55
 */
public class MyThread1 extends Thread {

    @Override
    public void run() {
        try {
            Thread.sleep(5000);
            System.out.println("thread-1");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
