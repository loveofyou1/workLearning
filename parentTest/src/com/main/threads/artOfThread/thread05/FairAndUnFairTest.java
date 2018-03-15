package com.main.threads.artOfThread.thread05;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author sunlei19
 * @create 2018-02-03 17:02
 */
public class FairAndUnFairTest {
    private static Lock fairLock = new ReentrantLock2(true);

    private static Lock unfairLock = new ReentrantLock2(false);

    public static void main(String[] args) {
        testLock();
        testUnFairLock();
    }

    private static void testLock() {
        for (int i = 0; i < 5; i++) {
            Job job = new Job(fairLock);
            job.start();
        }
    }

    private static void testUnFairLock() {
        for (int j = 0; j < 5; j++) {
            Job job = new Job(unfairLock);
            job.start();
        }
    }

    private static class Job extends Thread {
        private Lock lock;

        public Job(Lock lock) {
            this.lock = lock;
        }

        public void run() {
            System.out.println("job ");
        }
    }

    private static class ReentrantLock2 extends ReentrantLock {
        public ReentrantLock2(boolean fair) {
            super(fair);
        }

        public Collection<Thread> getQueuedThreads() {
            List<Thread> arrayList = new ArrayList<>(super.getQueuedThreads());
            Collections.reverse(arrayList);
            return arrayList;
        }
    }
}
