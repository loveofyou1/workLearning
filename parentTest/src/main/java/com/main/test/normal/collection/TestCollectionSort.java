package com.main.test.normal.collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TestCollectionSort {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(2);
        list.add(4);
        list.add(6);
        list.add(5);
        System.out.println(list);
        list.sort(Comparator.comparingInt(Integer::intValue).reversed());
        System.out.println(list);
    }
}
