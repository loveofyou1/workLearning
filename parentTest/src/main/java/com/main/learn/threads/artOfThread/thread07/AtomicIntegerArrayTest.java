package com.main.learn.threads.artOfThread.thread07;

import java.util.concurrent.atomic.AtomicIntegerArray;

/**
 * @author sunlei19
 * @create 2018-02-06 15:44
 */
public class AtomicIntegerArrayTest {
    static int[] value = new int[]{1, 2};
    static AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(value);

    public static void main(String[] args) {
        atomicIntegerArray.getAndSet(0, 3);
        System.out.println(atomicIntegerArray);
        System.out.println(atomicIntegerArray.get(0));
        System.out.println(value[0]);
    }
}
