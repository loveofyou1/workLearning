package com.main.threads.artOfThread.threadArt01;

import com.main.threads.util.SleepUtil;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Deprecated {
    public static void main(String[] args) {
        DateFormat format = new SimpleDateFormat("HH:mm:ss");
        Thread printThread = new Thread(new Runner(), "Printthread");
        printThread.setDaemon(true);
        printThread.start();

        //将printThread暂停
        printThread.suspend();
        System.out.println("main suspend thread:" + format.format(new Date()));
        SleepUtil.sleep(3);

        //恢复
        printThread.resume();
        System.out.println("main resume thread:" + format.format(new Date()));
        SleepUtil.sleep(3);

        printThread.stop();
        System.out.println("main stop thread:" + format.format(new Date()));
        SleepUtil.sleep(3);
    }

    static class Runner implements Runnable {
        @Override
        public void run() {
            DateFormat format = new SimpleDateFormat("HH:mm:ss");
            while (true) {
                System.out.println(Thread.currentThread().getName() + " Run at " + format.format(new Date()));
                SleepUtil.sleep(1);
            }
        }
    }

}
