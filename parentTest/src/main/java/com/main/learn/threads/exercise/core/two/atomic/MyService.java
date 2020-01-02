package com.main.learn.threads.exercise.core.two.atomic;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @author sunlei19
 * @Description TODO
 * @Date 2019/12/31 09:18
 */
public class MyService {
    public static AtomicLong aiRef = new AtomicLong();

    synchronized public void addNum() {
        System.out.println(Thread.currentThread().getName() + "加了100之后的值是:" + aiRef.addAndGet(100));
        aiRef.addAndGet(1);
    }

}
