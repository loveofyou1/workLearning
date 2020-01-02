package com.main.learn.threads.exercise.core.two.atomic;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author sunlei19
 * @Description TODO
 * @Date 2019/12/31 09:13
 */
public class AccountThread extends Thread {
    private AtomicInteger atomicInteger = new AtomicInteger(0);

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            System.out.println(atomicInteger.incrementAndGet());
        }
    }
}
