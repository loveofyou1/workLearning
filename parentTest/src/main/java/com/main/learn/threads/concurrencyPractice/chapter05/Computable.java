package com.main.learn.threads.concurrencyPractice.chapter05;

/**
 * @author sunlei19
 * @create 2019/3/28
 */
public interface Computable<A, V> {
    V compute(A arg) throws InterruptedException;
}
