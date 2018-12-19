package com.main.learn.threads.test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author sunlei19
 * @create 2018-03-08 12:54
 */
public class SimpleThreadPool {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 10; i++) {
            Runnable worker = new WorkerThread("" + i);
            executorService.execute(worker);
        }
        executorService.shutdown();
        while (!executorService.isTerminated()) {
        }
        System.out.println("Thread all threads.");
    }
}
