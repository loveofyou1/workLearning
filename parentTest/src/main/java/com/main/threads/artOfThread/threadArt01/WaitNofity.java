package com.main.threads.artOfThread.threadArt01;

import com.main.threads.util.SleepUtil;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class WaitNofity {

    static boolean flag = true;
    static Object lock = new Object();

    public static void main(String[] args) throws Exception {
        Thread waitThread = new Thread(new Wait(), "WaitThread");
        waitThread.start();
        TimeUnit.SECONDS.sleep(1);
        Thread notifyThread = new Thread(new Notify(), "notifyThread");
        notifyThread.start();
    }

    static class Wait implements Runnable {

        @Override
        public void run() {
            //加锁，拥有lock的Monitor
            synchronized (lock) {
                //当条件不满足时，继续wait，同时释放lock锁
                while (flag) {
                    try {
                        System.out.println(Thread.currentThread() + "flag is true. wait@ " + new SimpleDateFormat
                                ("HH:mm:ss").format(new Date()));
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread() + "flag is false.running@ " + new SimpleDateFormat
                        ("HH:mm:ss").format(new Date()));
            }
        }
    }

    static class Notify implements Runnable {
        @Override
        public void run() {
            //加锁，拥有lock的Monitor
            synchronized (lock) {
                System.out.println(Thread.currentThread() + "hold lock. notify@" + new SimpleDateFormat("HH:mm:ss")
                        .format(new Date()));
                lock.notifyAll();
                flag = false;
                SleepUtil.sleep(5);
            }
            //再次加锁
            synchronized (lock) {
                System.out.println(Thread.currentThread() + "hold lock again. notify@" + new SimpleDateFormat
                        ("HH:mm:ss")
                        .format(new Date()));
                SleepUtil.sleep(5);
            }
        }
    }

}
