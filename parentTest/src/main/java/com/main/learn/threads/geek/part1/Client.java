package com.main.learn.threads.geek.part1;

/**
 * @Description Client
 * @Author sunlei19
 * @Date 2020/12/5 20:24
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        Test test = new Test();
        try{
            System.out.println(test.calc());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
