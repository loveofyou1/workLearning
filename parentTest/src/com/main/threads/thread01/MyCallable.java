package com.main.threads.thread01;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.*;

public class MyCallable implements Callable {

    private String taskName;

    public MyCallable(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public Object call() throws Exception {
        System.out.println(">>>" + taskName + "任务启动");
        Date dateTmp1 = new Date();
        Thread.sleep(1000);
        Date dateTmp2 = new Date();
        long time = dateTmp2.getTime() - dateTmp1.getTime();
        System.out.println(">>>" + taskName + "任务终止");
        return taskName + "任务返回运行结果,当前任务时间【" + time + "毫秒】";
    }
}

class TestCallable {
    public static void main(String args[]) throws ExecutionException, InterruptedException {
        System.out.println("程序开始运行");
        Date date1 = new Date();
        int taskSize = 5;
        //创建线程池
        ExecutorService executorService = Executors.newFixedThreadPool(taskSize);
        //创建多个有返回值的任务
        List<Future> list = new ArrayList<Future>();
        for (int i = 0; i < taskSize; i++) {
            Callable callable = new MyCallable(i + "");
            Future future = executorService.submit(callable);
            list.add(future);
        }
        //关闭线程池
        executorService.shutdown();

        for (Future f : list) {
            // 从Future对象上获取任务的返回值，并输出到控制台
            System.out.println("》》》" + f.get().toString());
        }
        Date date2 = new Date();
        System.out.println("----程序结束运行----，程序运行时间【"
                + (date2.getTime() - date1.getTime()) + "毫秒】");
    }
}
