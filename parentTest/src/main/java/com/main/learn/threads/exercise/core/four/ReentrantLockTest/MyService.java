package com.main.learn.threads.exercise.core.four.ReentrantLockTest;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * ReentrantLock第一个测试类
 *
 * @author sunlei19
 * @date 2020/1/2
 */
public class MyService {
    private Lock lock = new ReentrantLock();

    public void testMethod() {
        lock.lock();
        for (int i = 0; i < 5; i++) {
            System.out.println("threadName=" + Thread.currentThread().getName() + " " + (i + 1));
        }
        lock.unlock();
    }
}
