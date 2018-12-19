package com.main.learn.threads.artOfThread.thread01;

public class MyRunnable implements Runnable {

    public MyRunnable() {

    }

    @Override
    public void run() {
        System.out.println("子线程id：" + Thread.currentThread().getId());
    }
}

class TestRunnable {
    public static void main(String args[]) {
        System.out.println("主线程id：" + Thread.currentThread().getId());
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.run();
    }
}
