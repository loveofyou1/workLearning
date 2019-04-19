package com.main.learn.threads.exercise;

import java.util.concurrent.*;

/**
 * @author sunlei19
 * @create 2019/4/19
 */
public class TestCachedThreadPool {
    public static void main(String[] args) {
        //ExecutorService executorService = Executors.newCachedThreadPool();
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        BlockingQueue queue = new LinkedBlockingQueue();
//        ThreadPoolExecutor executorService = new ThreadPoolExecutor(5, 10, 60, TimeUnit.SECONDS, queue);
        for (int i = 0; i < 5; i++) {
            executorService.execute(new TestRunnable());
            System.out.println("******************Thread" + i + "*********************");
        }
    }
}

class TestRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "this thread wad processed.");
    }
}
