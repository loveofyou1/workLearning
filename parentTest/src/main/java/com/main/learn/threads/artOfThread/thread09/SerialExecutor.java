package com.main.learn.threads.artOfThread.thread09;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;

/**
 * @author Dean
 * @create 2018/9/12
 */
public class SerialExecutor implements Executor {

    final Queue<Runnable> tasks = new ArrayDeque<>();
    final Executor executor;
    Runnable active;


    public SerialExecutor(Executor executor) {
        this.executor = executor;
    }


    public synchronized void execute(final Runnable command) {
        tasks.offer(() -> {
            try {
                command.run();
            } finally {
                scheduleNext();
            }
        });
    }


    protected synchronized void scheduleNext() {
        if ((active = tasks.poll()) != null) {
            executor.execute(active);
        }
    }
}
