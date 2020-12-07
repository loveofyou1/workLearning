package com.main.lamda.thread.test;

import com.google.common.collect.Lists;
import com.main.lamda.thread.entity.Shop;

import java.util.List;
import java.util.concurrent.*;
import java.util.stream.Collectors;

public class CompletableFutureTest2 {

    private static final long num = 1000000;

    private static List<Shop> shopList = Lists.newArrayList();

    public static void main(String[] args) {
        for (int i = 0; i < num; i++) {
            shopList.add(new Shop("shopName-" + i, (double) i));
        }
        handleShopCompletableFuture();
        handlerShopFuture();
    }

    private static void handleShopCompletableFuture() {
        long start = System.currentTimeMillis();

        List<CompletableFuture<String>> completableFutures = shopList.stream().map(shop -> {
                    CompletableFuture<String> future = null;
                    try {
                        future = CompletableFuture.supplyAsync(() -> String.format("%s price is %.2f",
                                shop.getName(), shop.getPrice()));
                    } catch (Exception e) {
                        if (future != null) {
                            future.completeExceptionally(e);
                        }
                    }
                    return future;
                }
        ).collect(Collectors.toList());

        List<String> resultList = completableFutures.stream().map(CompletableFuture::join).collect(Collectors.toList());

        //resultList.forEach(System.out::println);
        System.out.println(System.currentTimeMillis() - start);
    }

    private static void handlerShopFuture() {
        long start = System.currentTimeMillis();
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        List<Future> futureList = Lists.newArrayList();
        for (Shop shop : shopList) {
            futureList.add(executorService.submit(() -> String.format("%s price is %.2f",
                    shop.getName(), shop.getPrice())));
        }

        List<String> list = Lists.newArrayList();
        futureList.forEach(future -> {
            try {
                list.add((String) future.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        });
        executorService.shutdown();
        System.out.println(System.currentTimeMillis() - start);
    }
}
