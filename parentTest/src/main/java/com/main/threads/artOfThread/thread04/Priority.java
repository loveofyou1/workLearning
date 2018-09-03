package com.main.threads.artOfThread.thread04;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @author sunlei19
 * @create 2018/8/27
 */
public class Priority {
    private static volatile boolean notStart = false;
    private static volatile boolean notEnd = false;


    public static void main(String[] args) throws InterruptedException {
        List<Job> jobs = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int priority = i < 5 ? Thread.MIN_PRIORITY : Thread.MAX_PRIORITY;
            Job job = new Job(priority);
            jobs.add(job);
            Thread thread = new Thread(job, "Thread:" + i);
            thread.setPriority(priority);
            thread.start();
        }
        notStart = false;
        TimeUnit.SECONDS.sleep(10);
        notEnd = false;
        for (Job job : jobs) {
            System.out.println("Job priority: " + job.proirity + "  Count:" + job.jobCount);
        }
    }


    static class Job implements Runnable {
        private int proirity;
        private long jobCount;


        public Job(int proirity) {
            this.proirity = proirity;
        }


        @Override
        public void run() {
            while (notStart) {
                Thread.yield();
            }
            while (notEnd) {
                Thread.yield();
                jobCount++;
            }
        }
    }
}
