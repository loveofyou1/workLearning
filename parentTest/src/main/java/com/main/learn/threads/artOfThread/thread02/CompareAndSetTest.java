package com.main.learn.threads.artOfThread.thread02;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 比较并且设置
 *
 * @author sunlei19
 * @create 2018/8/18
 */
public class CompareAndSetTest {


    private AtomicInteger atomicInteger = new AtomicInteger(0);

    private int i = 0;


    public static void main(String[] args) {
        final CompareAndSetTest cas = new CompareAndSetTest();
        List<Thread> threads = new ArrayList<>(600);
        long start = System.currentTimeMillis();
        for (int j = 0; j < 100; j++) {
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i < 10000; i++) {
                        cas.count();
                        cas.safeCount();
                    }
                }
            });
            threads.add(thread);
        }
        for (Thread t : threads) {
            t.start();
        }

        //等待所有线程都执行完成
        for (Thread t : threads) {
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(cas.i);
        System.out.println(cas.atomicInteger.get());
        System.out.println(System.currentTimeMillis() - start);
    }


    private void safeCount() {
        for (; ; ) {
            int i = atomicInteger.get();
            boolean suc = atomicInteger.compareAndSet(i, ++i);
            if (suc) {
                break;
            }
        }
    }


    private void count() {
        i++;
    }

}
