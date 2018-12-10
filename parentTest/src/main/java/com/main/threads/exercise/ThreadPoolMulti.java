package com.main.threads.exercise;

import java.util.concurrent.*;

/**
 * @author sunlei19
 * @create 2018/12/10
 */
public class ThreadPoolMulti {

    private static CompletionService executorService1 = new ExecutorCompletionService<Object>(Executors.newFixedThreadPool(10));
    private static CompletionService executorService2 = new ExecutorCompletionService<Object>(Executors.newFixedThreadPool(10));

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Future<Long> result1 = executorService1.submit(() -> {
            long sum = 0;
            System.out.println(System.currentTimeMillis() + " =");
            for (int i = 0; i < 1000000; i++) {
                sum+=i;
            }
            System.out.println(System.currentTimeMillis() + " =");
            return sum;
        });
        System.out.println("线程一计算的和：" + executorService1.take().get());

        Future<Long> result2 = executorService2.submit(() -> {
            long sum2 = 0;
            System.out.println(System.currentTimeMillis() + " #");
            for (int i = 0; i < 1000000; i++) {
                sum2+=i;
            }
            System.out.println(System.currentTimeMillis() + " #");
            return sum2;
        });
        System.out.println("线程二计算的和：" + executorService2.take().get());
        executorService1.poll();
    }
}
