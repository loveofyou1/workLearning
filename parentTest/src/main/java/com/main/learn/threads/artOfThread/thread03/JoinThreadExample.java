package com.main.learn.threads.artOfThread.thread03;

/**
 * @author sunlei19
 * @create 2018/8/23
 */
public class JoinThreadExample {

    final int a = 0;
    int b = 0;


    public JoinThreadExample() {
        b = a;
    }


    public static void main(String[] args) {
        System.out.println("main thread start.....");
        Thread threadB = new Thread(() -> {
            System.out.println("threadb start .....");
            JoinThreadExample joinThreadExample = new JoinThreadExample();
            joinThreadExample.b = 2;
            System.out.println(joinThreadExample.a + ";" + joinThreadExample.b);
        });

        threadB.start();
        try {
            threadB.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("main thread is running...");
    }
}
