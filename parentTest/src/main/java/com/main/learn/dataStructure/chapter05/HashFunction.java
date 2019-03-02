package com.main.learn.dataStructure.chapter05;

import java.util.HashMap;
import java.util.Map;

public class HashFunction {
    public static void main(String[] args) {
        Map<String,String> hash = new HashMap<>();
        hash.put("1","a");
        hash.put("2","b");
        hash.put("3","c");
        System.out.println(hash);
    }
}
