package com.main.learn.threads.concurrencyPractice.chapter8;

import net.jcip.annotations.ThreadSafe;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.Semaphore;

/**
 * 使用Semaphore来控制任务的提交速率
 *
 * @author sunlei19
 * @create 2018-03-20 11:14
 */
@ThreadSafe
public class BoundedThread {
    private final Executor exec;
    private final Semaphore semaphore;

    public BoundedThread(Executor exec, Semaphore semaphore) {
        this.exec = exec;
        this.semaphore = semaphore;
    }

    public void submitTask(final Runnable command) throws InterruptedException {
        semaphore.acquire();
        try {
            exec.execute(new Runnable() {
                @Override
                public void run() {
                    try {
                        command.run();
                    } finally {
                        semaphore.release();
                    }
                }
            });
        } catch (RejectedExecutionException e) {
            semaphore.release();
        }
    }
}
