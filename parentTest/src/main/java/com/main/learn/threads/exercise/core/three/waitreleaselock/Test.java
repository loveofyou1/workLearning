package com.main.learn.threads.exercise.core.three.waitreleaselock;

/**
 * @author sunlei19
 * @Description TODO
 * @Date 2020/1/1 10:00
 */
public class Test {
    public static void main(String[] args) {
        Object lock = new Object();

        MyThread1 myThread1 = new MyThread1(lock);
        myThread1.start();

        MyThread2 myThread2 = new MyThread2(lock);
        myThread2.start();
    }
}
