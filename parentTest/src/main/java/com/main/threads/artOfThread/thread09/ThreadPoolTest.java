package com.main.threads.artOfThread.thread09;

import java.util.concurrent.*;

/**
 * @author Dean
 * @create 2018/9/12
 */
public class ThreadPoolTest {

    private static ExecutorService pool = new ThreadPoolExecutor(5, 10, 100, TimeUnit.MILLISECONDS, new ArrayBlockingQueue<>(10));


    public static void main(String[] args) throws ExecutionException, InterruptedException {
        for (int i = 0; i < 100; i++) {
            int finalI = i;
            Future<String> future = pool.submit(() -> "thread：" + finalI);
            System.out.println(future.get());
        }
        pool.shutdown();
    }
}
