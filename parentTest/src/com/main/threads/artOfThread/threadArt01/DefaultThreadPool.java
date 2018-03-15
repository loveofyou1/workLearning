package com.main.threads.artOfThread.threadArt01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/**
 * @author sunlei19
 * @create 2018-02-02 17:31
 */
public class DefaultThreadPool implements ThreadPool {

    private static final int MAX_WORKER_NUMBER = 10;

    private static final int DEFAULT_WORKER_NUMBERS = 5;

    private static final int MIN_WORKER_NUMBER = 1;

    private final LinkedList<Prority.Job> jobs = new LinkedList<>();

    private final List<Worker> workerList = Collections.synchronizedList(new ArrayList<Worker>());

    //工作者线程的总数
    private int worknums = DEFAULT_WORKER_NUMBERS;

    //线程编号生成
    private AtomicLong threadNum = new AtomicLong();

    public DefaultThreadPool() {
        initializeWorkers(DEFAULT_WORKER_NUMBERS);
    }

    public DefaultThreadPool(int num) {
        worknums = num > MAX_WORKER_NUMBER ? MAX_WORKER_NUMBER : num < MIN_WORKER_NUMBER ? MIN_WORKER_NUMBER : num;
        initializeWorkers(worknums);
    }


    @Override

    public void execute(Prority.Job job) {
        if (job != null) {
            //添加一个工作,然后进行通知
            synchronized (job) {
                jobs.addLast(job);
                jobs.notifyAll();
            }
        }
    }

    @Override
    public void shutdown() {
        for (Worker worker : workerList) {
            worker.shutdown();
        }
    }

    @Override
    public void addworks(int num) {
        synchronized (jobs) {
            if (num + this.worknums > MAX_WORKER_NUMBER) {
                num = MAX_WORKER_NUMBER - this.worknums;
            }
            initializeWorkers(num);
            this.worknums += num;
        }
    }

    @Override
    public void removeWorks(int num) {
        synchronized (jobs) {
            if (num >= this.worknums) {
                throw new IllegalArgumentException("beyond worknum");
            }
            int count = 0;
            while (count < num) {
                Worker worker = workerList.get(count);
                if (workerList.remove(worker)) {
                    count++;
                }
            }
            this.worknums -= count;
        }
    }

    @Override
    public int getJodSize() {
        return jobs.size();
    }

    //初始化线程工作者
    private void initializeWorkers(int nums) {
        if (nums > 0) {
            for (int i = 0; i < nums; i++) {
                Worker worker = new Worker();
                workerList.add(worker);
                Thread thread = new Thread(worker, "ThreadPool-Worker" + threadNum.incrementAndGet());
                thread.start();
            }
        }
    }

    class Worker implements Runnable {
        //是否工作
        private volatile boolean running = false;

        @Override
        public void run() {
            Prority.Job job = null;
            while (running) {
                synchronized (jobs) {
                    while (jobs.isEmpty()) {
                        try {
                            jobs.wait();
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                            return;
                        }
                    }
                }
                //取出第一个job
                job = jobs.removeFirst();
            }
            if (job != null) {
                try {
                    job.run();
                } catch (Exception ex) {

                }
            }
        }

        public void shutdown() {
            running = false;
        }
    }
}
