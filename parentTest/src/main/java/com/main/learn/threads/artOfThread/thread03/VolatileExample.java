package com.main.learn.threads.artOfThread.thread03;

/**
 * @author sunlei19
 * @create 2018/8/21
 */
public class VolatileExample {
    volatile int v1 = 0;
    volatile int v2 = 0;


    public void writer() {
        v1 = 1;
        v2 = 2;
        int i = v1;
        int j = v2;

        int k = i + j;

        v1 = k;
    }
}
