package com.main.learn.threads.concurrencyPractice.chapter4;

import java.util.concurrent.atomic.AtomicLong;

/**
 * 当委托失效时
 * @author sunlei19
 * @create 2018-03-16 21:16
 */
public class NumberRange {
    //不变性条件: lower <= upper
    private final AtomicLong lower = new AtomicLong(0);
    private final AtomicLong upper = new AtomicLong(0);

    public void setLower(int i) {
        //注意   不安全的“先检查后执行”
        if (i > upper.get()) {
            throw new IllegalArgumentException("can't set lower to " + i + " > upper");
        }
        lower.set(i);
    }

    public void setUpper(int i) {
        //注意   不安全的“先检查后执行”
        if (i < lower.get()) {
            throw new IllegalArgumentException("can't set uppser to " + i + "< lower");
        }
        upper.set(i);
    }

    public boolean isInRange(int i) {
        return (i >= lower.get() && i <= upper.get());
    }
}
