package com.main.learn.threads.exercise.core.two.lock;

/**
 * @author sunlei19
 * @Description TODO
 * @Date 2019/12/27 17:35
 */
public class HasSelfPrivateNum {

    private  int num = 0;

    synchronized public void add(String name) {
        try {

            if (name.equals("a")) {
                num = 100;
                System.out.println("a set over!");
                Thread.sleep(1000);
            } else {
                num = 200;
                System.out.println("b set over");
            }
            System.out.println(name + "num =" + num);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
