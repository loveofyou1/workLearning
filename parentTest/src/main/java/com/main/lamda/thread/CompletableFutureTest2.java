package com.main.lamda.thread;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

/**
 * @Description CompletableFutureTest2
 * @Author sunlei19
 * @Date 2020/12/4 20:02
 * @Version 1.0
 */
public class CompletableFutureTest2 {
    public static void main(String[] args) throws InterruptedException {
        CompletableFuture.supplyAsync(() -> {
            try {
                System.out.println("师傅准备做蛋糕");
                TimeUnit.SECONDS.sleep(1);
                System.out.println("蛋糕做好了");
            } catch (Exception e) {
                e.printStackTrace();
            }
            return "cake";
        }).thenAccept(cake -> System.out.println("我吃蛋糕:" + cake));
        System.out.println("我先去喝杯牛奶");
        Thread.sleep(5000);
    }
}
