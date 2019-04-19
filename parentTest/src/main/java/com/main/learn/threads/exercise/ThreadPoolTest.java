package com.main.learn.threads.exercise;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author sunlei19
 * @create 2019/4/19
 */
public class ThreadPoolTest {
    public static void main(String[] args) {
        //创建等待队列
        BlockingQueue<Runnable> bqueue = new ArrayBlockingQueue<Runnable>(20);
        //创建线程池，池中保存的线程数为3，允许的最大线程数为5
        ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(3, 5, 60, TimeUnit.MILLISECONDS, bqueue);

        //创建7个任务
        for (int i = 0; i < 7; i++) {
            poolExecutor.execute(new MyThread(i));
        }
        poolExecutor.shutdown();
    }
}

class MyThread implements Runnable {

    private int id;

    public MyThread(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "正在运行。。。");
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}