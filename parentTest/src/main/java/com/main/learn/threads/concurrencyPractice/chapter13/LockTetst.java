package com.main.learn.threads.concurrencyPractice.chapter13;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockTetst {

    Lock lock = new ReentrantLock();

    public boolean trySendOnSharedLine(String message, long timeout, TimeUnit unit) throws InterruptedException {
        long nanoToLock = unit.toNanos(timeout);
        if (!lock.tryLock(nanoToLock, TimeUnit.NANOSECONDS)) {
            return false;
        }

        try {
            return true;
        } finally {
            lock.unlock();
        }

    }


    public boolean sendOnSharedLine(String message) throws InterruptedException {
        lock.lockInterruptibly();
        try {
            return cancellableSendOnSharedLine(message);
        } finally {
            lock.unlock();
        }
    }

    private boolean cancellableSendOnSharedLine(String message) throws InterruptedException {
        return true;
    }
}
