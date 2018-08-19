package com.main.threads.concurrencyPractice.chapter7;

import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * 使用私有的Executor，并且该Executor的生命周期受限于方法调用
 *
 * @author sunlei19
 * @create 2018-03-19 17:23
 */
public class CheckMail {
    boolean checkMail(Set<String> hosts, long timeout, TimeUnit unit) throws InterruptedException {
        ExecutorService executorService = Executors.newCachedThreadPool();
        final AtomicBoolean hasNewMail = new AtomicBoolean(false);
        try {
            for (final String host : hosts) {
                executorService.execute(new Runnable() {
                    @Override
                    public void run() {
                        if (checkMail(host)) {
                            hasNewMail.set(true);
                        }
                    }
                });
            }
        } finally {
            executorService.shutdown();
            executorService.awaitTermination(timeout, unit);
        }
        return hasNewMail.get();
    }

    private boolean checkMail(String host) {
        if (host != null) {
            return true;
        }
        return false;
    }

}
