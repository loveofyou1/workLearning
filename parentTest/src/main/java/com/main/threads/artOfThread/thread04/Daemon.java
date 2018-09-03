package com.main.threads.artOfThread.thread04;

import com.main.threads.util.SleepUtil;

/**
 * @author sunlei19
 * @create 2018/8/27
 */
public class Daemon {
    public static void main(String[] args) {
        Thread thread = new Thread(new DaemonRunner(), "DaemonRunner");
        thread.setDaemon(true);
        thread.start();
    }


    static class DaemonRunner implements Runnable {
        @Override
        public void run() {
            try {
                SleepUtil.sleep(10);
            } finally {
                System.out.println("DaemonThread finally run.");
            }
        }
    }
}
