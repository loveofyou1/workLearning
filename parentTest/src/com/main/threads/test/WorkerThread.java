package com.main.threads.test;

/**
 * @author sunlei19
 * @create 2018-03-08 12:49
 */
public class WorkerThread implements Runnable {

    private String command;

    public WorkerThread(String s) {
        command = s;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " Start.Command = " + command);
        processCommand();
        System.out.println(Thread.currentThread().getName() + " End.");
    }

    private void processCommand() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return this.command;
    }
}
