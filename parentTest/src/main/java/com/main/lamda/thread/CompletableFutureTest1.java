package com.main.lamda.thread;

import java.util.concurrent.*;

public class CompletableFutureTest1 {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.submit(() -> {
            System.out.println("executorService 是守护线程：" + Thread.currentThread().isDaemon());
        });

        final CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(() -> {
            System.out.println(" this is lambda supplyAsync.");
            System.out.println("supplyAsync is daemon thread " + Thread.currentThread().isDaemon());
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("this lambda is executed by forkJoinPool");
            return "result1";
        });

        final CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            System.out.println(" this is task with executor");
            System.out.println(" supplySynnc use executorService is daemon thread: " + Thread.currentThread().isDaemon());
            return "result2";
        }, executorService);

        System.out.println(completableFuture.get());
        System.out.println(future.get());
        executorService.shutdown();
    }
}
