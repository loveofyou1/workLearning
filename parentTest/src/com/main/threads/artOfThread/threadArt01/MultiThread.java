package com.main.threads.artOfThread.threadArt01;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;

public class MultiThread {
    public static void main(String args[]) {
        //获取java线程管理
        ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
        //不需要获取同步的monitor和synchronized信息，仅获取线程和线程堆栈信息
        ThreadInfo[] threadInfos = threadMXBean.dumpAllThreads(false, false);
        //遍历线程信息，仅打印线程id和线程名称信息
        for (ThreadInfo threadInfo : threadInfos) {
            System.out.println("线程id：" + threadInfo.getThreadId() + ", " + "线程名称：" + threadInfo.getThreadName());
        }
    }
}
