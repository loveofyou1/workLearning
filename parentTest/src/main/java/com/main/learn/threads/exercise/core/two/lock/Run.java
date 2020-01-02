package com.main.learn.threads.exercise.core.two.lock;

/**
 * @author sunlei19
 * @Description TODO
 * @Date 2019/12/27 14:14
 */
public class Run {
    public static void main(String[] args) {
        try {
            MyThread myThread = new MyThread();
            myThread.setDaemon(true);
            myThread.start();
            Thread.sleep(5000);
            System.out.println("当我离开thread对象也不打印了，也就是停止了。");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
