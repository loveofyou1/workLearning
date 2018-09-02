package com.main.threads.artOfThread.thread04;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;

/**
 * 获取一个程序执行时同进行的线程
 *
 * @author sunlei19
 * @create 2018/8/27
 */
public class MultiThread {
    public static void main(String[] args) {
        //获取java线程管理MXBean
        ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
        //不需要获取同步的monitor和synchronizer信息，仅获取线程和线程堆栈信息
        ThreadInfo[] threadInfos = threadMXBean.dumpAllThreads(false, false);
        //遍历线程信息，仅打印线程id和线程名称信息
        for (ThreadInfo threadInfo : threadInfos) {
            System.out.println("线程ID = " + threadInfo.getThreadId() + ", 线程名称 = " + threadInfo.getThreadName());
        }
    }
}
