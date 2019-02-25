package com.main.learn.threads.concurrencyPractice.chapter01;

import net.jcip.annotations.NotThreadSafe;

/**
 * @author sunlei19
 * @create 2019/2/22
 */
@NotThreadSafe
public class UnSafeSequence {
    private int value;

    /**
     * 返回一个唯一的数值
     *
     * @return
     */
    public int getValue() {
        return value;
    }
}
