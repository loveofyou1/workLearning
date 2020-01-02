package com.main.learn.threads.exercise.core.two.atomic;

/**
 * @author sunlei19
 * @Description TODO
 * @Date 2019/12/31 09:14
 */
public class Run {
    public static void main(String[] args) {
        AccountThread accountThread = new AccountThread();

        Thread thread1 = new Thread(accountThread);
        thread1.start();

        Thread thread2 = new Thread(accountThread);
        thread2.start();

        Thread thread3 = new Thread(accountThread);
        thread3.start();

        Thread thread4 = new Thread(accountThread);
        thread4.start();
    }
}
