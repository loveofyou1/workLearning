package com.main.learn.threads.concurrencyPractice;

import javax.crypto.SecretKey;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author sunlei19
 * @create 2018-03-15 14:58
 */
public class ThreadBegin {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        Future future = executorService.submit(new Runnable() {
            @Override
            public void run() {
                System.out.println("thread!");
            }
        });
        System.out.println(future.get());
    }

    public static Set<SecretKey> knowSecrets;

    public void initialize(){
        knowSecrets = new HashSet<>();
    }
}
