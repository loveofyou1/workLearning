package com.main.learn.threads.concurrencyPractice.chapter03;

import net.jcip.annotations.GuardedBy;
import net.jcip.annotations.ThreadSafe;

/**
 * set/get方法增加了synchronized同步参数，只给set方法增加同步是不够的，
 * get方法也需要加锁同步才能获取正确的数据，不会获取过期的数值。
 *
 * @author sunlei19
 * @create 2019/3/15
 */
@ThreadSafe
public class SynchronizedInteger {
    @GuardedBy("this")
    private int value;

    public synchronized int get() {
        return value;
    }

    public synchronized void set() {
        this.value = value;
    }
}
