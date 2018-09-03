package com.main.threads.concurrencyPractice.chapter7;

import java.util.concurrent.*;

/**
 * @author sunlei19
 * @create 2018-03-19 15:03
 */
public class HelloInterrupter {
    private static final ScheduledExecutorService cancelExec = new ScheduledThreadPoolExecutor(2);

    public static void timeRun(Runnable runnable, Long timeout, TimeUnit unit) {
        final Thread taskThread = Thread.currentThread();
        cancelExec.schedule(new Runnable() {
            @Override
            public void run() {
                //指定的中断任务,超过一定时长会中断
                taskThread.interrupt();
            }
        }, timeout, unit);
        runnable.run();
    }


    public static void timeRun(final Runnable runnable, long timeout, TimeUnit unit) throws Exception {
        class RethrowableTask implements Runnable {
            private volatile Throwable t;

            public void run() {
                try {
                    runnable.run();
                } catch (Throwable t) {
                    this.t = t;
                }

            }

            void rethrow() throws Exception {
                if (t != null) {
                    throw new Exception(t);
                }
            }
        }

        RethrowableTask task = new RethrowableTask();
        final Thread taskThread = new Thread(task);
        taskThread.start();
        cancelExec.schedule(new Runnable() {
            @Override
            public void run() {
                taskThread.interrupt();
            }
        }, timeout, unit);

        taskThread.join(unit.toMillis(timeout));
        task.rethrow();
    }

    private static final ExecutorService taskExec = Executors.newFixedThreadPool(10);

    /**
     * 使用Future带超时的get方法，Future中的取消操作来实现中断
     *
     * @param runnable
     * @param timeout
     * @param unit
     * @throws Exception
     */
    public static void timeRunFuture(Runnable runnable, long timeout, TimeUnit unit) throws Exception {
        Future<?> task = taskExec.submit(runnable);
        try {
            task.get(timeout, unit);
        } catch (InterruptedException e) {
            //接下来任务将被取消
            e.printStackTrace();
        } catch (ExecutionException e) {
            //如果在任务中跑出的异常，那么重新抛出该异常
            throw new Exception(e.getCause());
        } catch (TimeoutException e) {

        } finally {
            //如果任务已经结束，那么执行取消操作也不会带来任何影响
            task.cancel(true);
        }
    }
}
