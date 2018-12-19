package com.main.learn.threads.artOfThread.thread01;

public class MyThread extends Thread {
/*
    private static int num = 0;

    public MyThread() {
        num++;
    }*/

    private String name;

    public MyThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        //System.out.println("主动创建的第" + num + "线程！");
        System.out.println("thread's name is " + name + " 子线程id：" + Thread.currentThread().getId());
    }


}

class Test {
    public static void main(String args[]) {
        System.out.println("主线程id:" + Thread.currentThread().getId());
        MyThread thread1 = new MyThread("thread1");
        thread1.start();
        MyThread thread2 = new MyThread("thread2");
        thread2.run();
    }
}
