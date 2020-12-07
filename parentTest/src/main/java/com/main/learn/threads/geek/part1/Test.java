package com.main.learn.threads.geek.part1;

/**
 * @Description Test
 * @Author sunlei19
 * @Date 2020/12/5 20:19
 * @Version 1.0
 */
public class Test {

    private Long count = 0L;

    private void add10K() {
        int idx = 0;
        while (idx++ < 10000) {
            synchronized (count) {
                count += 1;
            }
        }
    }

    public long calc() throws InterruptedException {
        // 创建两个线程，执行add()操作
        Thread th1 = new Thread(() -> {
            this.add10K();
        });

        Thread th2 = new Thread(() -> {
            this.add10K();
        });

        th1.start();
        th2.start();

        th1.join();
        th2.join();
        return count;
    }

}
