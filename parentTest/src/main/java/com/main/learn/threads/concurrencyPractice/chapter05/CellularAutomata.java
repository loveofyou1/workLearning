package com.main.learn.threads.concurrencyPractice.chapter05;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * 栅栏的作用：所有线程必须同时到达栅栏位置，才能继续执行。
 *
 * @author sunlei19
 * @create 2019/3/28
 */
public class CellularAutomata {
    private final Board mainboard;
    private final CyclicBarrier barrier;
    private final Worker[] workers;

    public CellularAutomata(Board board) {
        this.mainboard = board;
        int count = Runtime.getRuntime().availableProcessors();
        this.barrier = new CyclicBarrier(count, () -> mainboard.commitNewValues());
        this.workers = new Worker[count];
        for (int i = 0; i < count; i++) {
            workers[i] = new Worker(mainboard.getSubBoard(count, i));
        }
    }

    public class Worker implements Runnable {
        private final Board board;

        public Worker(Board board) {
            this.board = board;
        }


        @Override
        public void run() {
            while (!board.hasConverged()) {
                for (int x = 0; x < board.getMaxY(); x++) {
                    for (int y = 0; y < board.getMaxY(); y++) {
                        board.setNewValue(x, y, compute(x, y));
                    }
                }
                //添加栅栏
                try {
                    barrier.await();
                } catch (InterruptedException e) {
                    return;
                } catch (BrokenBarrierException e) {
                    return;
                }
            }
        }

        private int compute(int x, int y) {
            return x + y;
        }
    }

    public void start() throws InterruptedException {
        for (int i = 0; i < workers.length; i++) {
            new Thread(workers[i]).start();
        }
        mainboard.waitForConvergence();
    }
}
