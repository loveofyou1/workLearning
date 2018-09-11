package com.main.threads.artOfThread.thread08;

import java.util.concurrent.CyclicBarrier;

/**
 * @author Dean
 * @create 2018/9/11
 */
public class CyclicBarrierTest3 {
    static CyclicBarrier cyclicBarrier = new CyclicBarrier(2);


    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            try {
                cyclicBarrier.await();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        thread.start();
        thread.interrupt();

        try {
            cyclicBarrier.await();
        } catch (Exception e) {
            System.out.println(cyclicBarrier.isBroken());
            e.printStackTrace();
        }
    }

}
