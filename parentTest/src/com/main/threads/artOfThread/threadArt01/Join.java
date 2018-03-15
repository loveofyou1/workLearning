package com.main.threads.artOfThread.threadArt01;

import java.util.concurrent.TimeUnit;

/**
 * Thread Join exicise
 *
 * @author sunlei19
 * @create 2018-02-02 16:23
 */
public class Join {
    public static void main(String[] args) throws InterruptedException {
        Thread privousThread = Thread.currentThread();
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(new Domino(privousThread), String.valueOf(i));
            thread.start();
            privousThread = thread;
        }
        TimeUnit.SECONDS.sleep(5);
        System.out.println(Thread.currentThread().getName() + " Terminate.");
    }

    static class Domino implements Runnable {
        private Thread thread;

        public Domino(Thread thread) {
            this.thread = thread;
        }

        @Override
        public void run() {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName() + " terminate.");
        }
    }
}
