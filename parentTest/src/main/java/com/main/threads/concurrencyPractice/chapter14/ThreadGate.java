package com.main.threads.concurrencyPractice.chapter14;

import net.jcip.annotations.GuardedBy;
import net.jcip.annotations.ThreadSafe;

/**
 * 阀门类：使用wait和notifyall可以实现重新关闭的阀门
 */
@ThreadSafe
public class ThreadGate {
    //条件谓词:opened-since(n)(isOpen || generation > n)
    @GuardedBy("this")
    private boolean isOpen;
    @GuardedBy("this")
    private int generation;

    public synchronized void close() {
        isOpen = false;
    }

    public synchronized void open() {
        ++generation;
        isOpen = true;
        notifyAll();
    }

    //阻塞并直到：open-since(generation on entry)
    public synchronized void await() throws InterruptedException {
        int arrivalGeneration = generation;
        if (!isOpen && arrivalGeneration == generation) {
            wait();
        }
    }
}
