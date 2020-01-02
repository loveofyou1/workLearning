package com.main.learn.threads.exercise.core.three;

/**
 * @author sunlei19
 * @Description TODO
 * @Date 2020/1/1 09:10
 */
public class Test1 {
    public static void main(String[] args) {
        String str = new String("");
        try {
            str.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
