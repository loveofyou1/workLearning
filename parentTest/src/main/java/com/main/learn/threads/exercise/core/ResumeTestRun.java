package com.main.learn.threads.exercise.core;

/**
 * @author sunlei19
 * @Description TODO
 * @Date 2019/12/27 13:12
 */
public class ResumeTestRun {
    public static void main(String[] args) {
        try {
            ResumeThread resumeThread = new ResumeThread();
            resumeThread.start();
            Thread.sleep(500);
            resumeThread.suspend();

            System.out.println("A=" + System.currentTimeMillis() + " i=" + resumeThread.getId());
            Thread.sleep(500);
            System.out.println("A=" + System.currentTimeMillis() + " i=" + resumeThread.getId());

            //resumeThread.resume();
            Thread.sleep(500);

            resumeThread.suspend();
            System.out.println("B=" + System.currentTimeMillis() + " i=" + resumeThread.getId());
            Thread.sleep(500);
            System.out.println("B=" + System.currentTimeMillis() + " i=" + resumeThread.getId());

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
