package com.main.learn.threads.exercise.core.three.size5;

/**
 * @author sunlei19
 * @Description TODO
 * @Date 2020/1/1 09:39
 */
public class MyThreadB extends Thread {

    private Object lock = new Object();

    public MyThreadB(Object lock) {
        super();
        this.lock = lock;
    }

    @Override
    public void run() {
        try {
            synchronized (lock) {
                for (int i = 0; i < 10; i++) {
                    MyList.add();
                    if (MyList.size() == 5) {
                        lock.notify();
                        System.out.println("已经发出通知");
                    }
                    System.out.println("添加" + (i + 1) + "个元素");
                    Thread.sleep(1000);
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
