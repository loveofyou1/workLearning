package com.main.learn.threads.concurrencyPractice.chapter03;

/**
 * 可见性
 *
 * @author sunlei19
 * @create 2019/3/15
 */
public class NoVisibility {
    private static boolean ready;
    private static int number;

    private static class ReaderThread extends Thread {
        public void run() {
            while (!ready) {
                Thread.yield();
            }
            System.out.println(number);
        }
    }

    public static void main(String[] args) {
        new ReaderThread().run();
        number = 42;
        ready = true;
    }
}
