package com.main.learn.dataStructure.chapter04;

import java.util.HashMap;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

public class TestSet {
    public static void main(String[] args) {
        SortedSet sortedSet = new TreeSet();
        sortedSet.add("1");
        sortedSet.add("1");
        sortedSet.add("3");
        sortedSet.add("2");
        System.out.println(sortedSet);
        System.out.println(sortedSet.first());
        System.out.println(sortedSet.last());
        System.out.println(sortedSet.subSet("1", "3"));
        System.out.println(sortedSet.headSet("3"));


        Map<String, String> testMap = new HashMap<>();
        testMap.put("1", "a");
        testMap.put("2", "b");
        testMap.put("3", "c");
        for (String entry : testMap.values()) {
            System.out.println(entry);
        }

        for (String key : testMap.keySet()){
            System.out.println(key);
        }
    }
}
