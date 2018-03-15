package com.main.threads.threadArt01;

import com.main.threads.util.SleepUtil;

import java.util.concurrent.TimeUnit;

public class ThreadInterupt {
    public static void main(String[] args) throws InterruptedException {
        //sleepThread 不停的尝试睡眠
        Thread sleepThread = new Thread(new SleepRunner(), "sleepThread");
        sleepThread.setDaemon(true);

        Thread busyThread = new Thread(new Runner(), "busyThread");
        busyThread.setDaemon(true);
        sleepThread.start();
        busyThread.start();

        TimeUnit.SECONDS.sleep(5);
        sleepThread.interrupt();
        busyThread.interrupt();
        System.out.println("sleepThread interrupt:" + sleepThread.isInterrupted());
        System.out.println("busyThread interrupt:" + busyThread.isInterrupted());
        TimeUnit.SECONDS.sleep(2);
    }

    static class SleepRunner implements Runnable {

        @Override
        public void run() {
            while (true) {
                SleepUtil.sleep(10);
            }
        }
    }

    static class Runner implements Runnable {
        @Override
        public void run() {
            while (true) {

            }
        }
    }

}
