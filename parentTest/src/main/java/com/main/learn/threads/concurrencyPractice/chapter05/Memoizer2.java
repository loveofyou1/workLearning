package com.main.learn.threads.concurrencyPractice.chapter05;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 *
 * @author sunlei19
 * @create 2019/3/28
 */
public class Memoizer2<A, V> implements Computable<A, V> {
    //使用ConcurrentHashMap来保证线程安全
    private final Map<A, V> cache = new ConcurrentHashMap<>();
    private final Computable<A, V> computable;

    public Memoizer2(Computable<A, V> computable) {
        this.computable = computable;
    }

    @Override
    public V compute(A arg) throws InterruptedException {
        V result = cache.get(arg);
        if (result == null) {
            result = computable.compute(arg);
            cache.put(arg, result);
        }
        return result;
    }
}
