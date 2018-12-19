package com.main.learn.threads.artOfThread.thread08;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * @author Dean
 * @create 2018/9/11
 */
public class CyclicBarrierTest2 {
    static CyclicBarrier cyclicBarrier = new CyclicBarrier(2, new A());


    public static void main(String[] args) throws BrokenBarrierException, InterruptedException {
        new Thread(() -> {
            try {
                cyclicBarrier.await();
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println(1);

        }).start();
        cyclicBarrier.await();
        System.out.println(2);
    }


    static class A implements Runnable {
        @Override
        public void run() {
            System.out.println(3);
        }
    }
}

