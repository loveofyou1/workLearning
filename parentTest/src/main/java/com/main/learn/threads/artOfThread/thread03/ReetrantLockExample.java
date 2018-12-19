package com.main.learn.threads.artOfThread.thread03;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author sunlei19
 * @create 2018/8/21
 */
public class ReetrantLockExample {
    int a = 0;
    ReentrantLock lock = new ReentrantLock();


    public void writer() {
        lock.lock();  //获取锁
        try {
            a++;
        } finally {
            lock.unlock();//释放锁
        }
    }


    public void reader() {
        lock.lock();//获取锁
        try {
            int i = a;

        } finally {
            lock.unlock();//释放锁
        }
    }
}
