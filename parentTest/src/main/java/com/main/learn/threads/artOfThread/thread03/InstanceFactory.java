package com.main.learn.threads.artOfThread.thread03;

/**
 * @author sunlei19
 * @create 2018/8/27
 */
public class InstanceFactory {
    private static class InstanceHolder {
        public static Instance instance = new Instance();
    }


    public Instance getInstance() {
        return InstanceHolder.instance;
    }
}
