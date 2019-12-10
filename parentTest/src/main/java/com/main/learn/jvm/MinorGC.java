package com.main.learn.jvm;

/**
 * @author sunlei19
 * @Description TODO
 * @Date 2019/10/7 18:17
 */
public class MinorGC {
    private static final int _1MB = 1024 * 1024;

    public static void main(String[] args) {
        //testAllocation();
        testPretenureSizeThreshold();
    }

    /**
     * VM参数：-verbose:gc-Xms20M -Xmx20m -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRation=8
     */
    public static void testAllocation() {
        byte[] allocation1, allocation2, allocation3, allocation4;
        allocation1 = new byte[2 * _1MB];
        allocation2 = new byte[2 * _1MB];
        allocation3 = new byte[2 * _1MB];
        allocation4 = new byte[2 * _1MB];//出现一次Minor GC
    }

    /**
     * VM参数：-verbose:gc-Xms20M -Xmx20m -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRation=8
     * -XX:PretenureSizeThreshold=3145728,大于这个参数的对象，直接分配到老年代
     */
    public static void testPretenureSizeThreshold() {
        byte[] allocation;
        allocation = new byte[4 * _1MB];//直接分配到老年代中
        System.out.println(allocation);
    }
}
