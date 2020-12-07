package com.main.lamda.thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @Description FutureTaskTest
 * @Author sunlei19
 * @Date 2020/12/4 20:40
 * @Version 1.0
 */
public class FutureTaskTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        Future<String> future = executorService.submit(() -> {
            Thread.sleep(50000);
            return "hello";
        });

        System.out.println(future.get());
    }
}
