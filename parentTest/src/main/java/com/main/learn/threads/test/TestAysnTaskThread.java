package com.main.learn.threads.test;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author sunlei19
 * @create 2018/10/10
 */
public class TestAysnTaskThread {
    private static ExecutorService executorService = Executors.newFixedThreadPool(10);

    private static ExecutorService executorService1 = Executors.newFixedThreadPool(10);

    private static ExecutorService executorService2 = Executors.newFixedThreadPool(10);


    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Integer sumMain = 0;
        /*for (int i = 0; i < 100000; i++) {
            int finalI = i;
            Future<Integer> future = executorService.submit(() -> {
                System.out.println(Thread.currentThread().getName() + System.currentTimeMillis());
                return finalI;
            });
            sum += future.get();
        }*/

        Future<Integer> future = executorService.submit(() -> method1());
        sumMain += future.get();

        Future<Integer> future1 = executorService.submit(() -> method2());
        sumMain += future1.get();
        System.out.println(sumMain);
    }


    private static int method1() throws ExecutionException, InterruptedException {
        int sum1 = 0;
        for (int i = 0; i < 100000; i++) {
            int finalI = i;
            Future<Integer> future = executorService1.submit(() -> finalI);

            sum1 += future.get();
        }
        System.out.println(sum1 + ":" + Thread.currentThread().getName());
        return sum1;
    }


    private static int method2() throws ExecutionException, InterruptedException {
        int sum2 = 0;
        for (int i = 0; i < 100000; i++) {
            int finalI = i;
            Future<Integer> future = executorService2.submit(() -> finalI);
            sum2 += future.get();
        }
        System.out.println(sum2 + ":" + Thread.currentThread().getName());
        return sum2;
    }
}
