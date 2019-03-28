package com.main.learn.threads.concurrencyPractice.chapter05;

import java.util.Map;
import java.util.concurrent.*;

/**
 * @author sunlei19
 * @create 2019/3/28
 */
public class Memoizer<A, V> implements Computable<A, V> {
    private final Map<A, Future<V>> cache = new ConcurrentHashMap<>();
    private final Computable<A, V> c;

    public Memoizer(Computable<A, V> c) {
        this.c = c;
    }


    @Override
    public V compute(A arg) throws InterruptedException {
        Future<V> future = cache.get(arg);
        if (future == null) {
            Callable<V> eval = () -> c.compute(arg);
            FutureTask<V> futureTask = new FutureTask<V>(eval);
            //putIfAbsent保证原子性
            future = cache.putIfAbsent(arg, futureTask);
            if (future == null) {
                future = futureTask;
                futureTask.run();
            }
        }
        try {
            return future.get();
        } catch (ExecutionException e) {
            throw new InterruptedException();
        }
    }
}
