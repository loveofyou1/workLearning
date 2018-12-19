package com.main.learn.threads.concurrencyPractice.chapter7;

import java.math.BigInteger;
import java.util.concurrent.BlockingQueue;

/**
 * 通过中断来取消线程执行
 *
 * @author sunlei19
 * @create 2018-03-19 14:25
 */
public class PrimeProducer extends Thread {
    private final BlockingQueue<BigInteger> queue;

    public PrimeProducer(BlockingQueue<BigInteger> queue) {
        this.queue = queue;
    }

    public void run() {
        try {
            BigInteger p = BigInteger.ONE;
            while (!Thread.currentThread().isInterrupted()) {
                queue.put(p = p.nextProbablePrime());
            }
        } catch (InterruptedException e) {
            //允许线程退出
            e.printStackTrace();
        }
    }

    //取消线程
    public void cancel() {
        interrupt();
    }

    public BigInteger getNextTask() {

        boolean interrupted = false;

        try {
            while (true) {
                try {
                    return queue.take();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    //重新尝试
                }
            }
        } finally {
            if (interrupted) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
