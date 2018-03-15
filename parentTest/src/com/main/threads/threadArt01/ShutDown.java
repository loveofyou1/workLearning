package com.main.threads.threadArt01;

import java.util.concurrent.TimeUnit;

public class ShutDown {

    public static void main(String[] args) throws InterruptedException {

        Runner one = new Runner();
        Thread countThread = new Thread(one, "CountThread");
        TimeUnit.SECONDS.sleep(1);
        countThread.interrupt();

        Runner two = new Runner();
        countThread = new Thread(two, "CountThread");
        countThread.start();
        TimeUnit.SECONDS.sleep(1);
        two.cancel();
    }

    private static class Runner implements Runnable {
        private long i;
        private volatile boolean on = true;

        @Override
        public void run() {
            if (on && !Thread.currentThread().isInterrupted()) {
                i++;
            }
            System.out.println("Count i= " + i);
        }

        public void cancel() {
            on = false;
        }
    }

}
