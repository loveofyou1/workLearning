package com.main.learn.threads.exercise.september.thread;

/**
 * @author sunlei19
 * @Description TODO
 * @Date 2019/10/6 17:21
 */
public class DemoTest {
    public static void main(String[] args) {


        int count = 0;
        for (int i = 0; i <= 10; i++) {
            count += i;
        }
        System.out.println(count);

        try {
            //主线程设置ThreadLocal，子线程中无法获取
            ThreadLocalDemo.setThreadLocal("hello-" + Thread.currentThread().getName());

            DemoThread demo = new DemoThread(count);
            Thread thread1 = new Thread(demo);
            thread1.start();
            System.out.println(thread1.getName());
            System.out.println(thread1.currentThread().getName());
            System.out.println(thread1.getThreadGroup().getParent());


            new Thread(() -> {
                //子线程设置ThreadLocal，在子线程中的所有调用都可以获取到值
                ThreadLocalDemo.setThreadLocal("hello-" + Thread.currentThread().getName());
                System.out.println("hello-" + Thread.currentThread().getName());

                ThreadLocalTest thread = new ThreadLocalTest();
                thread.test();
            }).start();

        } catch (Exception e) {
            System.out.println("thread running error" + e);
        }
    }
}
