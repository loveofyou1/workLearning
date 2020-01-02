package com.main.learn.threads.exercise.core.one;

/**
 * @author sunlei19
 * @Description TODO
 * @Date 2019/12/27 13:38
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        long begin = System.currentTimeMillis();
        int count = 0;
        for (int i = 0; i < 5000000; i++) {
            Thread.yield();
            count = count + (i + 1);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("用时：" + (endTime - begin) + "毫秒！");
    }
}
