package com.main.learn.threads.exercise.core.two.atomic;

/**
 * @author sunlei19
 * @Description TODO
 * @Date 2019/12/31 09:22
 */
public class MyServiceTest {
    public static void main(String[] args) {
        try {
            MyService myService = new MyService();

            MyThread[] arrays = new MyThread[5];
            for (int i = 0; i < arrays.length; i++) {
                arrays[i] = new MyThread(myService);
            }

            for (int i = 0; i < arrays.length; i++) {
                arrays[i].start();
            }

            Thread.sleep(1000);
            System.out.println(myService.aiRef.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
