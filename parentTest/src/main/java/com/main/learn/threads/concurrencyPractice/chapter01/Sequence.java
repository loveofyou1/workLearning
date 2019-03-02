package com.main.learn.threads.concurrencyPractice.chapter01;

import net.jcip.annotations.GuardedBy;
import net.jcip.annotations.ThreadSafe;

/**
 * 安全
 */
@ThreadSafe
public class Sequence {
    @GuardedBy("this")
    private int value;

    /**
     * 安全返回数值
     *
     * @return
     */
    public synchronized int getValue() {
        return value;
    }
}
