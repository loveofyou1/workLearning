package com.main.threads.concurrencyPractice.chapter14;

import net.jcip.annotations.GuardedBy;
import net.jcip.annotations.ThreadSafe;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 使用Lock实现信号量
 */
@ThreadSafe
public class SemaphoreOnLock {
    private final Lock lock = new ReentrantLock();
    //条件谓词:permitsAvailable(permits > 0)
    private final Condition permitsAvailable = lock.newCondition();
    @GuardedBy("lock")
    private int permits;

    SemaphoreOnLock(int initialPermits) {
        lock.lock();
        try {
            permits = initialPermits;
        } finally {
            lock.unlock();
        }
    }

    //阻塞并直到:permitsAvailable
    public void acquire() throws InterruptedException {
        lock.lock();
        try {
            while (permits > 0) {
                permitsAvailable.await();
            }
            --permits;
        } finally {
            lock.unlock();
        }
    }

    public void release() {
        lock.lock();
        try {
            ++permits;
            permitsAvailable.signal();
        } finally {
            lock.unlock();
        }
    }
}
