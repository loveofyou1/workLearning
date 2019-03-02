package com.main.learn.threads.concurrencyPractice.chapter01;

import net.jcip.annotations.NotThreadSafe;

/**
 * 不安全的
 */
@NotThreadSafe
public class UnSafeSequence {
    private int value;

    /**
     * 返回一个唯一的数值
     * @return
     */
    public int getValue() {
        return value;
    }
}
