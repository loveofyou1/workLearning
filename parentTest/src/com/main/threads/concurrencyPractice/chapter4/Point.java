package com.main.threads.concurrencyPractice.chapter4;

import net.jcip.annotations.Immutable;

/**
 * 不可变的Point类
 *
 * @author sunlei19
 * @create 2018-03-16 20:57
 */
@Immutable
public class Point extends java.awt.Point {
    public final int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
