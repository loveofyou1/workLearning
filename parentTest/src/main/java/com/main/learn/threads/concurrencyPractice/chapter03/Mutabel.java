package com.main.learn.threads.concurrencyPractice.chapter03;

import net.jcip.annotations.NotThreadSafe;

/**
 * @author sunlei19
 * @create 2019/3/15
 */
@NotThreadSafe
public class Mutabel {
    //没有做同步
    private int value;

    public int get() {
        return value;
    }

    public void set(int value) {
        this.value = value;
    }
}
