package com.main.learn.threads.artOfThread.thread06;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentLinkedDeque;

public class OneQueueTest {
    public static void main(String[] args) {
        // 非阻塞队列
        testNoBlockingQueue();
    }

    private static void testNoBlockingQueue() {
        Queue concurrentQueue = new ConcurrentLinkedDeque();
        for (int i = 0; i < 8; i++) {
            concurrentQueue.add(i);
        }

        concurrentQueue.forEach((o) -> System.out.println(o));
    }

    private static void testBlockingQueue() {
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(10);
        arrayBlockingQueue.add(1);
    }
}
