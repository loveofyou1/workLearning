package com.main.learn.dataStructure.chapter03;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sunlei19
 * @create 2018/12/18
 */
public class ThisArrayList {
    public static void main(String[] args) {
        List<Integer> list = test();
        list.removeIf(o -> o > 10);
        list.forEach((Integer o) -> System.out.println(o));
    }

    private static List<Integer> test() {
        List<Integer> list = new ArrayList<>(20);
        for (int i = 0; i < 20; i++) {
            list.add(i);
        }
        return list;
    }
}
