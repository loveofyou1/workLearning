package com.main.threads.concurrencyPractice.chapter7;

import net.jcip.annotations.GuardedBy;

import java.net.URL;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * 保存未完成的任务以备后续执行
 *
 * @author sunlei19
 * @create 2018-03-19 17:39
 * @see java.util.concurrent.ExecutorService
 */
public abstract class WebCrawler {
    private volatile TrackingExecutor executor;
    @GuardedBy("this")
    private final Set<URL> urlsToCrawl = new HashSet<URL>();

    public synchronized void start() {
        executor = new TrackingExecutor(Executors.newCachedThreadPool());
        for (URL url : urlsToCrawl) {
            submitCrawlTask(url);
        }
        urlsToCrawl.clear();
    }

    public synchronized void stop() throws InterruptedException {
        try {
            saveUncrawled(executor.shutdownNow());
            if (executor.awaitTermination(100, TimeUnit.SECONDS)) {
                saveUncrawled(executor.getCanceledTasks());
            }
        } finally {
            executor = null;
        }
    }

    public abstract List<URL> processPage(URL url);

    private void saveUncrawled(List<Runnable> runnables) {
        for (Runnable task : runnables) {
            urlsToCrawl.add(((CrawlTask) task).getPage());
        }
    }

    protected void submitCrawlTask(URL url) {
        executor.execute(new CrawlTask(url));
    }

    private class CrawlTask implements Runnable {
        private final URL url;

        private CrawlTask(URL url) {
            this.url = url;
        }

        @Override
        public void run() {
            for (URL link : processPage(url)) {
                if (Thread.currentThread().isInterrupted()) {
                    return;
                }
                submitCrawlTask(link);
            }
        }

        public URL getPage() {
            return url;
        }
    }
}
