package com.main.threads.concurrencyPractice.chapter13;

import java.util.concurrent.TimeUnit;

public class SleepBoundedBuffer<V> extends BaseBoundedBuffer<V> {
    protected SleepBoundedBuffer(int capacity) {
        super(capacity);
    }

    public void put(V v) throws InterruptedException {
        while (true) {
            synchronized (this) {
                if (!isFull()) {
                    doPut(v);
                    return;
                }
            }
            Thread.sleep(10);
        }
    }

    public V take() throws InterruptedException {
        while (true) {
            synchronized (this) {
                if (!isEmpty()) {
                    return doTake();
                }
            }
            Thread.sleep(10);
        }
    }
}
