package com.main.learn.threads.artOfThread.thread07;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author sunlei19
 * @create 2018-02-06 15:35
 */
public class AtomicIntegerTest {
    static AtomicInteger ai = new AtomicInteger(1);

    public static void main(String[] args) {
        System.out.println(ai.getAndIncrement());
        System.out.println(ai.get());
        System.out.println(ai.addAndGet(10));
        System.out.println(ai.incrementAndGet());
    }
}
