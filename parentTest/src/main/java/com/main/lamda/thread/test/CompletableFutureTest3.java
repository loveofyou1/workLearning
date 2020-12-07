package com.main.lamda.thread.test;

import com.google.common.collect.Lists;
import com.main.lamda.thread.entity.Shop;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

/**
 * @Description CompletableFutureTest3
 * @Author sunlei19
 * @Date 2020/12/5 19:33
 * @Version 1.0
 */
public class CompletableFutureTest3 {
    private static List<Shop> shopList = Lists.newArrayList();

    public static void main(String[] args) {
        for (int i = 0; i < 10000; i++) {
            shopList.add(new Shop("shopName-" + i, (double) i));
        }

        List<String> strList = shopList.stream()
                .map(shop -> CompletableFuture.supplyAsync(() -> shop.getName()))
                .map(future -> future.thenCompose(str -> CompletableFuture.supplyAsync(() -> str)))
                .map(CompletableFuture::join).collect(Collectors.toList());

        for (String str : strList) {
            System.out.println(str);
        }
    }
}
