package com.main.learn.threads.exercise.core.two.lock;

/**
 * @author sunlei19
 * @Description TODO
 * @Date 2019/12/27 14:12
 */
public class MyThread extends Thread {

    private int count = 0;

    @Override
    public void run() {
        try {
            while (true) {
                count++;
                Thread.sleep(1000);
                System.out.println("count=" + count);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
