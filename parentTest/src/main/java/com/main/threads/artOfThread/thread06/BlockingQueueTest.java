package com.main.threads.artOfThread.thread06;

import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @author Dean
 * @create 2018/9/9
 */
public class BlockingQueueTest {

    /**
     * 生产者
     */
    static class Producer implements Runnable {

        private final BlockingQueue<Integer> blockingQueue;
        private volatile boolean flag;
        private Random random;


        Producer(BlockingQueue<Integer> blockingQueue) {
            this.blockingQueue = blockingQueue;
            flag = false;
            random = new Random();
        }


        @Override
        public void run() {
            while (!flag) {
                int info = random.nextInt(100);
                try {
                    blockingQueue.put(info);
                    System.out.println(Thread.currentThread().getName() + "producer:" + info + " ");
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }


        public void shutDown() {
            flag = true;
        }
    }

    /**
     * 消费者
     */
    static class Customer implements Runnable {

        private final BlockingQueue<Integer> blockingQueue;
        private volatile boolean flag;


        Customer(BlockingQueue<Integer> blockingQueue) {
            this.blockingQueue = blockingQueue;
        }


        @Override
        public void run() {
            while (!flag) {
                int info;
                try {
                    info = blockingQueue.take();
                    System.out.println(Thread.currentThread().getName() + "customer:" + info + " ");
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }


        public void shutDown() {
            flag = true;
        }
    }


    public static void main(String[] args) {
        BlockingQueue<Integer> blockingQueue = new LinkedBlockingQueue<>(10);
        Producer producer = new Producer(blockingQueue);
        Customer customer = new Customer(blockingQueue);

        //创建5个生产者和5个消费者
        for (int i = 0; i < 10; i++) {
            if (i < 5) {
                new Thread(producer, "producer:" + i + " ").start();
            } else {
                new Thread(customer, "customer:" + (i - 5) + " ").start();
            }
        }

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        producer.shutDown();
        customer.shutDown();
    }
}
