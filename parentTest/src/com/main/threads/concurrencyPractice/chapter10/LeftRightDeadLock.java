package com.main.threads.concurrencyPractice.chapter10;

/**
 * 死锁
 * 1.锁顺序死锁
 *
 * @author sunlei19
 * @create 2018-03-23 10:10
 */
public class LeftRightDeadLock {
    private final Object left = new Object();
    private final Object right = new Object();

    public void leftRight() {
        synchronized (left) {
            synchronized (right) {
                System.out.println("left -> right");
            }
        }
    }

    public void rightLeft() {
        synchronized (right) {
            synchronized (left) {
                System.out.println("right -> left");
            }
        }
    }
}
