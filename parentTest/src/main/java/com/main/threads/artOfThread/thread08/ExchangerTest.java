package com.main.threads.artOfThread.thread08;

import java.util.concurrent.Exchanger;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Dean
 * @create 2018/9/11
 */
public class ExchangerTest {
    private static final Exchanger<String> exchanger = new Exchanger<>();
    private static ExecutorService threadPool = Executors.newFixedThreadPool(2);


    public static void main(String[] args) {
        threadPool.execute(() -> {
            String a = "银行流水A";
            try {
                exchanger.exchange(a);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        threadPool.execute(() -> {
            String b = "银行流水B";
            String a;
            try {
                a = exchanger.exchange("b");
                System.out.println("交换后数据：" + a + " ===" + b);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        threadPool.shutdown();
    }
}
