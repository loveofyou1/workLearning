package com.main.test.map;

import java.util.HashMap;
import java.util.Map;

/**
 * @author sunlei19
 * @create 2018/10/22
 */
public class TestMap {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("1", "1");
        map.put("2", "2");
        map.put("1", "3");

        System.out.println(map.toString());
    }
}
