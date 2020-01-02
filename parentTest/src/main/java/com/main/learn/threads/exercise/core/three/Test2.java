package com.main.learn.threads.exercise.core.three;

/**
 * @author sunlei19
 * @Description TODO
 * @Date 2020/1/1 09:14
 */
public class Test2 {
    public static void main(String[] args) {
        try {
            String lock = new String("lock");
            System.out.println("syn上面");
            synchronized (lock) {
                System.out.println("syn里面开始");
                lock.wait();
                System.out.println("syn里面结束");
            }
            System.out.println("syn下面");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
