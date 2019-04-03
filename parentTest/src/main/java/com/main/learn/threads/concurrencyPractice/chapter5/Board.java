package com.main.learn.threads.concurrencyPractice.chapter5;

/**
 * @author sunlei19
 * @create 2019/3/28
 */
public class Board {

    public int value;

    public boolean hasConverged() {
        return false;
    }

    public void setNewValue(int x, int y, int z) {
        value = x + y + z;
    }


    public int getMaxY() {
        return value;
    }

    public void commitNewValues() {
        value++;
    }

    public Board getSubBoard(int count, int i) {
        Board board = new Board();
        board.value = count - i;
        return board;
    }

    public void waitForConvergence() throws InterruptedException {
        this.wait();
    }
}
