package com.main.learn.threads.exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * @author sunlei19
 * @create 2019/4/19
 */
public class CallableDemo {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        List<Future<String>> resultList = new ArrayList<>();

        //创建10个任务并执行
        for (int i = 0; i < 10; i++) {
            //使用ExecutorService执行Callable类型的任务，并将结果保存在future变量中
            Future<String> future = executorService.submit(new TaskWithResult(i));
            //将任务结果存储到列表中
            resultList.add(future);
        }

        for (Future<String> fs : resultList) {
            try {
                //Future返回如果没有完成，则一直循环等待，知道future返回完成
                while (!fs.isDone()) {
                }
                System.out.println(fs.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            } finally {
                //启动一次顺序关闭，执行以前提交的任务，但不接受新任务
                executorService.shutdown();
            }
        }
    }
}


class TaskWithResult implements Callable<String> {

    private int id;

    /**
     * @param id
     */
    public TaskWithResult(int id) {
        this.id = id;
    }

    /**
     * 任务的具体过程，一旦任务传给ExecutorService的submit方法，
     * 则该方法自动在一个线程上运行
     *
     * @return
     * @throws Exception
     */
    @Override
    public String call() throws Exception {
        //System.out.println("call() method wad processed!!! " + Thread.currentThread().getName());
        //返回结果
        return "call() method wad processed!!! " + Thread.currentThread().getName();
    }
}