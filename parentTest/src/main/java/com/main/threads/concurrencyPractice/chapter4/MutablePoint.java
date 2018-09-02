package com.main.threads.concurrencyPractice.chapter4;

import net.jcip.annotations.NotThreadSafe;

/**
 * @author sunlei19
 * @create 2018-03-16 20:41
 */
@NotThreadSafe
public class MutablePoint {
    public int x, y;

    public MutablePoint() {
        x = 0;
        y = 0;
    }

    public MutablePoint(MutablePoint p) {
        this.x = p.x;
        this.y = p.y;
    }
}
