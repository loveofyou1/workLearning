package com.main.threads.artOfThread.thread04;

import com.main.threads.util.SleepUtil;

/**
 * @author sunlei19
 * @create 2018/8/27
 */
public class ThreadState {
    public static void main(String[] args) {
        new Thread(new TimeWaiting(), "TimeWaitingThread").start();
        new Thread(new Waiting(), "WaitingThread").start();
        new Thread(new Blocked(), "BlockedThread-1").start();
        new Thread(new Blocked(), "BlockedThread-2").start();
    }


    static class TimeWaiting implements Runnable {

        @Override
        public void run() {
            while (true) {
                SleepUtil.sleep(100);
            }
        }
    }

    static class Waiting implements Runnable {

        @Override
        public void run() {
            while (true) {
                synchronized (Waiting.class) {
                    try {
                        Waiting.class.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    static class Blocked implements Runnable {
        @Override
        public void run() {
            synchronized (Blocked.class) {
                while (true) {
                    SleepUtil.sleep(100);
                }
            }
        }
    }
}
