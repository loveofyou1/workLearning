package com.main.learn.threads.exercise.core.two.inner;

/**
 * @author sunlei19
 * @Description TODO
 * @Date 2019/12/30 14:44
 */
public class OutClass {
    static class InnerClass {
        public void method1() {
            synchronized ("其他锁") {
                for (int i = 0; i <= 10; i++) {
                    System.out.println(Thread.currentThread().getName() + "i=" + i);
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        public void method2() {
            for (int i = 11; i <= 20; i++) {
                System.out.println(Thread.currentThread().getName() + "i=" + i);
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
