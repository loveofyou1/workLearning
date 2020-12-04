package com.main.lamda.thread;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureTest {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture future = new CompletableFuture();
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("CompletableFuture 可以控制这个任务的执行");
                future.complete("任务返回结果");
            }
        }).start();

        System.out.println(future.get());
    }
}
