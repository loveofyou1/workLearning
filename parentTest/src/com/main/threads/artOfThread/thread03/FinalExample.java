package com.main.threads.artOfThread.thread03;

/**
 * @author sunlei19
 * @create 2018/8/22
 */
public class FinalExample {
    int i;  //普通变量
    final int j; //fianl变量
    static FinalExample obj;


    public FinalExample() { //构造函数
        i = 1;  //普通变量
        j = 2;  //写final变量
    }


    public void writer() {
        obj = new FinalExample();
    }


    public static void reader() {
        FinalExample object = obj;
        int a = object.i;
        int b = object.j; //读final域
    }
}
