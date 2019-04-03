package com.main.test.map;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

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
    }
}
