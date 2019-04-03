package com.main.learn.threads.concurrencyPractice.chapter5;

import net.jcip.annotations.GuardedBy;

import java.util.HashMap;
import java.util.Map;

/**
 * 使用synchronized确保缓存同步
 *
 * @author sunlei19
 * @create 2019/3/28
 */
public class Memoizer1<A, V> implements Computable<A, V> {

    @GuardedBy("this")
    private final Map<A, V> cache = new HashMap<>();
    private final Computable<A, V> computable;

    public Memoizer1(Computable<A, V> computable) {
        this.computable = computable;
    }

    /**
     * 由于该方法使用了synchronized，导致方法伸缩性不好，多个线程访问时会导致程序排队等待。
     *
     * @param arg
     * @return
     * @throws InterruptedException
     */
    @Override
    public synchronized V compute(A arg) throws InterruptedException {
        V result = cache.get(arg);
        if (result == null) {
            result = computable.compute(arg);
            cache.put(arg, result);
        }
        return result;
    }
}
