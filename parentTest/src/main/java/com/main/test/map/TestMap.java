package com.main.test.map;

import com.google.common.collect.Maps;

import java.util.*;

/**
 * @author sunlei19
 * @create 2018/10/22
 */
public class TestMap {
    public static void main(String[] args) {
        Map<String, String> map = new LinkedHashMap<>();
        map.put("1", "1");
        map.put("3", "3");
        map.put("2", "2");

        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

        System.out.println(Runtime.getRuntime().availableProcessors());

        Set<String> set = new HashSet<>();
        set.add("1");
        set.add("2");

        testLinkedMap();
    }

    private static void testLinkedMap() {
        Map<Integer, String> hisMap = Maps.newLinkedHashMap();
        hisMap.put(1, "hello1");
        hisMap.put(2, "hello2");
        hisMap.put(3, "hello3");

        LinkedHashMap<Integer, String> histNew = Maps.newLinkedHashMap();
        ListIterator<Map.Entry<Integer, String>> iterator = new ArrayList<>(hisMap.entrySet()).listIterator(hisMap.size());
        while (iterator.hasPrevious()) {
            Map.Entry<Integer, String> entry = iterator.previous();
            histNew.put(entry.getKey(), entry.getValue());
        }

        for (Map.Entry<Integer, String> entry : histNew.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}
