package com.main.threads.concurrencyPractice.chapter13;

import net.jcip.annotations.ThreadSafe;

/**
 * 当不满足条件时，有界缓存不会执行相应的操作
 *
 * @param <V>
 */
@ThreadSafe
public class GrumpyBoundedBuffer<V> extends BaseBoundedBuffer {

    protected GrumpyBoundedBuffer(int capacity) {
        super(capacity);
    }

    public synchronized void put(V v) throws BufferFullException {
        if (isFull()) {
            throw new BufferFullException();
        }
        doPut(v);
    }

    public synchronized V take() throws BufferEmptyException {
        if (isEmpty()) {
            throw new BufferEmptyException();
        }
        return (V) doTake();
    }
}

class BufferEmptyException extends Throwable {
}

class BufferFullException extends Throwable {
}