package com.main.learn.guava;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.ListeningExecutorService;
import com.google.common.util.concurrent.MoreExecutors;

import java.util.Date;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class TestCache1 {
    private static ListeningExecutorService listeningExecutorService = MoreExecutors.listeningDecorator(Executors.newFixedThreadPool(10));

    private static final LoadingCache<String, String> cache = CacheBuilder.newBuilder().maximumSize(1000).
            expireAfterAccess(1, TimeUnit.SECONDS).build(new CacheLoader<String, String>() {
        @Override
        public String load(String key) throws Exception {
            System.out.println(Thread.currentThread().getName() + "==load start==" + "，时间=" + new Date());
            // 模拟同步重载耗时2秒
            Thread.sleep(2000);
            String value = "load-" + new Random().nextInt(10);
            System.out.println(
                    Thread.currentThread().getName() + "==load end==同步耗时2秒重载数据-key=" + key + ",value=" + value + "，时间=" + new Date());
            return value;
        }

        @Override
        public ListenableFuture<String> reload(String key, String oldValue) throws Exception {
            System.out.println(Thread.currentThread().getName() + "==reload ==异步重载-key=" + key + "，时间=" + new Date());
            return listeningExecutorService.submit(new Callable<String>() {
                @Override
                public String call() throws Exception {
                    Thread.sleep(2000);
                    String value = "reload-" + new Random().nextInt(10);
                    System.out.println(Thread.currentThread().getName() + "==reload-callable-result=" + value + "，时间=" + new Date());
                    return value;
                }
            });
        }
    });
    //倒计时器
    private static CountDownLatch latch = new CountDownLatch(1);

    public static void main(String[] args) {

    }
}
