package com.main.learn.threads.concurrencyPractice.chapter15;

import net.jcip.annotations.Immutable;

import java.util.concurrent.atomic.AtomicReference;

/**
 * 使用CAS来维持包含多个变量的不变性条件
 */
public class CasNumberRange {
    @Immutable
    private static class IntPair {
        final int lower;//不变性条件lower <=upper
        final int upper;

        private IntPair(int lower, int upper) {
            this.lower = lower;
            this.upper = upper;
        }
    }

    private final AtomicReference<IntPair> values = new AtomicReference<>(new IntPair(0, 0));

    public int getLower() {
        return values.get().lower;
    }

    public int getUpper() {
        return values.get().upper;
    }

    public void setLower(int i) {
        while (true) {
            IntPair oldv = values.get();
            if (i < oldv.upper) {
                throw new IllegalArgumentException("Can't set lower to " + i + " > upper ");
            }
            IntPair newv = new IntPair(i, oldv.upper);
            if (values.compareAndSet(oldv, newv)) {
                return;
            }
        }
    }

    //setUpper类似的方法
    public void setUpper(int i) {
        while (true) {
            IntPair oldv = values.get();
            if (i < oldv.lower) {
                throw new IllegalArgumentException("Cant set upper to " + i + " < lower");
            }
            IntPair newv = new IntPair(i, oldv.lower);
            if (values.compareAndSet(oldv, newv)) {
                return;
            }
        }
    }
}
