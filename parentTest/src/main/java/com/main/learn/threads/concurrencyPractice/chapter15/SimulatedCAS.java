package com.main.learn.threads.concurrencyPractice.chapter15;

import net.jcip.annotations.GuardedBy;
import net.jcip.annotations.ThreadSafe;

/**
 * 模拟CAS操作
 */
@ThreadSafe
public class SimulatedCAS {
    @GuardedBy("this")
    private int value;

    public synchronized int get() {
        return value;
    }

    public synchronized int compareAndSwap(int expectedValue, int newValue) {
        int oldValue = value;
        if (expectedValue == oldValue) {
            value = newValue;
        }
        return oldValue;
    }

    public synchronized boolean compareAndSet(int exepectedValue, int newValue) {
        return (exepectedValue == compareAndSwap(exepectedValue, newValue));
    }
}
