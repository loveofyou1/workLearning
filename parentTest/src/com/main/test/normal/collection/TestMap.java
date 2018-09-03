package com.main.test.normal.collection;

import java.util.HashMap;
import java.util.Map;

/**
 * map删除数据测试
 *
 * @author Dean
 * @create 2018/8/31
 */
public class TestMap {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("1", "a");
        map.put("2", "b");
        map.put("3", "c");

        String key = "3";
        if (map.containsKey(key)) {
            map.remove(key);
        }

        for (Map.Entry entry : map.entrySet()) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }

        for (String value : map.values()) {
            System.out.println(value);
        }

        for (String key1 : map.keySet()) {
            System.out.println(key1);
        }
    }
}
