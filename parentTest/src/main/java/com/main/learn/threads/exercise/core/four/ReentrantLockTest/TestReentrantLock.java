package com.main.learn.threads.exercise.core.four.ReentrantLockTest;

/**
 * @author sunlei19
 * @date 2020/1/2
 */
public class TestReentrantLock {
    public static void main(String[] args) {
        MyService myService = new MyService();
        MyThread thread1 = new MyThread(myService);
        MyThread thread2 = new MyThread(myService);
        MyThread thread3 = new MyThread(myService);
        MyThread thread4 = new MyThread(myService);
        MyThread thread5 = new MyThread(myService);

        thread1.start();
        thread2.start();
        thread3.start();
        thread3.start();
        thread5.start();
    }
}
