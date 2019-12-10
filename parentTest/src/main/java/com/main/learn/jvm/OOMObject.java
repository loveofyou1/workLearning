package com.main.learn.jvm;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sunlei19
 * @Description 内存占位符对象，一个OOMObject大约64kb
 * @Date 2019/10/8 09:01
 */
public class OOMObject {
    /**
     * 内存占位符对象，一个OOMObject大约64kb
     *
     * ：-Xms100m-Xmx100m-XX:+UseSerialGC
     */
    public static byte[] placeholder = new byte[64 * 1024];

    public static void fillHeap(int num) throws InterruptedException {
        List<OOMObject> list = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            Thread.sleep(500);
            list.add(new OOMObject());
        }
        System.gc();
    }

    public static void main(String[] args) throws Exception {
        fillHeap(1000);
    }
}
