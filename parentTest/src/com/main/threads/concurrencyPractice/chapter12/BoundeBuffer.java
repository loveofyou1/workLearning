package com.main.threads.concurrencyPractice.chapter12;

import net.jcip.annotations.GuardedBy;
import net.jcip.annotations.ThreadSafe;

import java.util.concurrent.Semaphore;

/**
 * @author sunlei19
 * @create 2018-03-27 17:26
 */
@ThreadSafe
public class BoundeBuffer<E> {
    private final Semaphore availableItems, availableSpace;
    @GuardedBy("this")
    private final E[] items;
    @GuardedBy("this")
    private int putPosition = 0, takePosition = 0;
    private ThreadLocal lock = new ThreadLocal();

    public BoundeBuffer(int capacity) {
        this.availableItems = new Semaphore(0);
        this.availableSpace = new Semaphore(capacity);
        this.items = (E[]) new Object[capacity];
    }

    public boolean isEmpty() {
        return availableItems.availablePermits() == 0;
    }

    public boolean isFull() {
        return availableSpace.availablePermits() == 0;
    }

    public void put(E x) throws InterruptedException {
        availableSpace.acquire();
        doInsert(x);
        availableItems.release();
    }

    public synchronized void put1(E e) throws InterruptedException {
        while (isFull()) {
            wait();
        }
        boolean isEmpty = isEmpty();
        doInsert(e);
        if (isEmpty) {
            notifyAll();
        }
    }

    public E take() throws InterruptedException {
        availableItems.acquire();
        E item = doExtract();
        availableSpace.release();
        return item;
    }

    private synchronized void doInsert(E x) {
        int i = putPosition;
        items[i] = x;
        putPosition = (++i == items.length) ? 0 : 1;
    }

    private synchronized E doExtract() {
        int i = takePosition;
        E x = items[i];
        items[i] = null;
        takePosition = (++i == items.length) ? 0 : 1;
        return x;
    }

    void stateDependentMethod() throws InterruptedException {
        //必须通过一个锁来保护条件谓词
        synchronized (lock) {
            while (!conditionPredicate()) {
                lock.wait();
                //现在对象处于合适的状态
            }
        }
    }

    private boolean conditionPredicate() {
        return false;
    }
}
