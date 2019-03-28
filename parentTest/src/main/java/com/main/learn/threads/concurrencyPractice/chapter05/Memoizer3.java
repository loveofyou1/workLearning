package com.main.learn.threads.concurrencyPractice.chapter05;

import java.util.Map;
import java.util.concurrent.*;

/**
 * @author sunlei19
 * @create 2019/3/28
 */
public class Memoizer3<A, V> implements Computable<A, V> {
    private final Map<A, Future<V>> cache = new ConcurrentHashMap<>();
    private final Computable<A, V> c;

    public Memoizer3(Computable<A, V> c) {
        this.c = c;
    }

    @Override
    public V compute(A arg) throws InterruptedException {
        Future<V> future = cache.get(arg);
        /**
         * 由于map的put方法不是原子操作，“若没有则添加”是非原子操作，导致两个线程会计算出同一个值。
         */
        if (future == null) {
            Callable<V> eval = () -> c.compute(arg);
            FutureTask<V> futureTask = new FutureTask<V>(eval);
            future = futureTask;
            cache.put(arg, future);
            futureTask.run();
        }
        try {
            return future.get();
        } catch (ExecutionException e) {
            throw new InterruptedException();
        }
    }
}
