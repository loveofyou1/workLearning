package com.main.threads.concurrencyPractice.chapter8;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * 单线程Executor中任务发生死锁（不要这么做）
 *
 * @author sunlei19
 * @create 2018-03-19 20:14
 */
public class ThreadDeadLock {
    ExecutorService executorService = Executors.newSingleThreadExecutor();

    public class RenderPageTask implements Callable<String> {
        @Override
        public String call() throws Exception {
            Future<String> header, footer;
            header = executorService.submit(new LoadFileTask("header.html"));
            footer = executorService.submit(new LoadFileTask("footer.html"));
            String page = renderBody();
            //将发生死锁  由于任务在等待子任务的结果
            return header.get() + page + footer.get();
        }

        private String renderBody() {
            return "page";
        }
    }

    private class LoadFileTask implements Callable<String> {

        public LoadFileTask(String s) {
            return;
        }

        @Override
        public String call() throws Exception {
            return null;
        }
    }
}
