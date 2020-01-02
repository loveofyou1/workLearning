package com.main.learn.threads.exercise.core;

/**
 * @author sunlei19
 * @Description TODO
 * @Date 2019/12/26 20:59
 */
public class MyThread extends Thread {
    private int count = 5;

    @Override
    synchronized public void run() {
        super.run();
        count--;
        System.out.println("由 " + this.currentThread().getName() + "计算,count=" + count);
    }
}
