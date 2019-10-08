package com.main.learn.threads.exercise.september.pool;

import com.main.learn.threads.exercise.september.thread.ThreadLocalDemo;

import java.util.Random;
import java.util.concurrent.*;

/**
 * @author sunlei19
 * @Description TODO
 * @Date 2019/10/6 18:33
 */
public class ThreadPoolTest {

    private static ThreadPoolExecutor pool = new ThreadPoolExecutor(10, 100, 5000,
            TimeUnit.SECONDS, new LinkedBlockingQueue<>());

    private static ExecutorCompletionService executorCompletionService = new ExecutorCompletionService(pool);

    public static void main(String[] args) {
        Random random = new Random();
        try {
            String test = "pin";
            for (int i = 0; i < 50; i++) {
                executorCompletionService.submit(() -> {
                    ThreadLocalDemo.setThreadLocal(test);
                    Thread.sleep(random.nextInt(5000));
                    return runThread();
                });
            }
            int completionTask = 0;
            while (completionTask < 50) {
                Future<String> future = executorCompletionService.take();
                System.out.println(future.get());
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            pool.shutdownNow();
        }
    }

    private static String runThread() {
        return Thread.currentThread().getName() + ": " + ThreadLocalDemo.getThreadLocal();
    }
}
