package com.main.learn.threads.artOfThread.thread04;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author Dean
 * @create 2018/9/3
 */
public class ThreadId {
    private static final AtomicInteger nextId = new AtomicInteger(0);

    private static final ThreadLocal<Integer> threadId = ThreadLocal.withInitial(() -> nextId.getAndIncrement());


    public static int get() {
        return threadId.get();
    }
}
