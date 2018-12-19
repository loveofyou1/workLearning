package com.main.learn.threads.artOfThread.thread03;

/**
 * @author sunlei19
 * @create 2018/8/21
 */
public class MonitorExample {
    int a = 0;


    public synchronized void writer() {//1
        a++;                           //2
    }                                  //3释放锁


    public synchronized void reader() {//4获取锁
        int i = a;                     //5
        /**
         * ..........
         */
    }                                  //6释放锁
}
