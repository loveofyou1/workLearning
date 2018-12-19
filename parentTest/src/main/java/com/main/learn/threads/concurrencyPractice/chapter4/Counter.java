package com.main.learn.threads.concurrencyPractice.chapter4;

import net.jcip.annotations.GuardedBy;
import net.jcip.annotations.ThreadSafe;

/**
 * java监视器模式，该类封装了value状态变量，所有的操作都需要Counter类中方法来访问，并且方法都是同步的。
 *
 * @author sunlei19
 * @create 2018-03-16 14:44
 */
@ThreadSafe
public class Counter {
    @GuardedBy("this")
    private long value = 0;

    public synchronized long getValue() {
        return value;
    }

    public synchronized long increment() {
        if (value == Long.MAX_VALUE) {
            throw new IllegalStateException("counter overflow");
        }
        return ++value;
    }
}
