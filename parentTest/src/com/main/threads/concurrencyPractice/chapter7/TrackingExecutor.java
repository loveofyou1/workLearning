package com.main.threads.concurrencyPractice.chapter7;

import java.util.*;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @author sunlei19
 * @create 2018-03-19 17:31
 */
public class TrackingExecutor extends AbstractExecutorService {
    private final ExecutorService exec;
    private final Set<Runnable> tasksCanceledAtShutdown = Collections.synchronizedSet(new HashSet<Runnable>());

    public TrackingExecutor(ExecutorService exec) {
        this.exec = exec;
    }

    public List<Runnable> getCanceledTasks() {
        if (!exec.isTerminated()) {
            throw new IllegalStateException();
        }
        return new ArrayList<Runnable>(tasksCanceledAtShutdown);
    }

    @Override
    public void shutdown() {

    }

    @Override
    public List<Runnable> shutdownNow() {
        return null;
    }

    @Override
    public boolean isShutdown() {
        return false;
    }

    @Override
    public boolean isTerminated() {
        return false;
    }

    @Override
    public boolean awaitTermination(long timeout, TimeUnit unit) throws InterruptedException {
        return false;
    }

    @Override
    public void execute(final Runnable command) {
        exec.execute(new Runnable() {
            @Override
            public void run() {
                try{
                    command.run();
                }finally {
                    if (isShutdown() && Thread.currentThread().isInterrupted()) {
                        tasksCanceledAtShutdown.add(command);
                    }
                }
            }
        });
    }
}
