package com.main.learn.threads.artOfThread.thread03;

/**
 * @author sunlei19
 * @create 2018/8/21
 */
public class SynchronizedExample {
    int a = 0;
    boolean flag = false;


    public synchronized void writer() {//获取锁
        a = 1;
        flag = true;
    }//释放锁


    public synchronized void reader() {//获取锁
        if (flag) {
            int i = a;
            /***
             * ........
             */

        }
    }//释放锁
}
