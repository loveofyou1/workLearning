package com.main.threads.artOfThread.thread08;

/**
 * @author sunlei19
 * @create 2018-02-06 16:10
 */
public class JoinCountDownLatchTest {
    public static void main(String[] args) throws InterruptedException {
        Thread parse1 = new Thread(new Runnable() {
            @Override
            public void run() {

            }
        });

        Thread parse2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("parse2 is finished.");
            }
        });

        parse1.start();
        parse2.start();


        parse1.join();
        parse2.join();

        System.out.println("all parse finished.");
    }
}
