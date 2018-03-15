package com.main.threads.threadArt01;

/**
 * @author sunlei19
 * @create 2018-02-02 17:27
 */
public interface ThreadPool {

    //执行一个job，这个job需要实现Runnable
    void execute(Prority.Job job);

    //shutdown pool
    void shutdown();

    //增加工作者线程
    void addworks(int num);

    //减少工作者线程
    void removeWorks(int num);

    //得到正在等待执行的任务数量
    int getJodSize();
}
