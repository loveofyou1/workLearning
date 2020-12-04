package com.main.test.map;

import com.alibaba.fastjson.JSON;
import com.google.common.collect.Sets;

import java.util.HashSet;
import java.util.Set;

/**
 * @Description TestMapJson
 * @Author sunlei19
 * @Date 2020/5/26 20:45
 * @Version 1.0
 */
public class TestMapJson {
    public static void main(String[] args) {
/*        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 2);
        map.put(3, 4);
        System.out.println(JSON.toJSONString(map));

        Map<String, String> stringMap = new HashMap<>();
        stringMap.put("01", "标准");
        stringMap.put("05", "经济");
        System.out.println(JSON.toJSONString(stringMap));*/

        Set<String> set1 = new HashSet<>();
        set1.add("1");
        set1.add("2");

        Set<String> set2 = new HashSet<>();
        set2.add("1");
        set2.add("2");
        //boolean retainAll = set1.retainAll(set2);
        //boolean contains = set1.contains("1");
        Sets.SetView<String> difference = Sets.difference(set1, set2);
        Sets.SetView<String> union = Sets.union(set1, set2);
        System.out.println(difference);
        System.out.println(JSON.toJSONString(union));
    }
}
