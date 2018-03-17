package com.main.threads.concurrencyPractice.chapter4;

import java.util.Vector;

/**
 * 在原有类中增加方法时最好的方式
 *
 * @param <E>
 * @author sunlei
 */
public class BetterVector<E> extends Vector<E> {
    public synchronized boolean putIfAbsent(E x) {
        boolean absent = !contains(x);
        if (absent) {
            add(x);
        }
        return absent;
    }
}
