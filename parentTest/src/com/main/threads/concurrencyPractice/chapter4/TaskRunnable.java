package com.main.threads.concurrencyPractice.chapter4;

import javafx.concurrent.Task;

import java.util.concurrent.BlockingQueue;

public class TaskRunnable implements Runnable{

    BlockingQueue<Task> queue;
    @Override
    public void run() {
        try{
            queue.take();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
