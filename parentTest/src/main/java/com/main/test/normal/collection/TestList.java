package com.main.test.normal.collection;

import com.google.common.collect.Lists;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author sunlei19
 * @create 2019/10/16
 */
public class TestList {

    public static void main(String[] args) {
        List<String> testList = Lists.newArrayList();
        /*testList.add("10");
        testList.add("9");
        testList.add("8");
        testList.add("7");*/
        Set<List<String>> sets = new HashSet<>();
        for (int i = 0; i < 20; i++) {
            testList.add(String.valueOf(i));
        }
        int len = 20 / 100;
        for (int j = 0; j <= len; j++) {
            int endIndex = (j + 1) * 100 > 20 ? 20 : (j + 1) * 100;
            if (j * 100 == 20) {
                continue;
            }
            sets.add(testList.subList(j * 100, endIndex));
        }

        for (List<String> test : sets) {
            System.out.println(test);
        }

     /*   Collections.reverse(testList);
        List<String> subList = testList.subList(0, 3);

        System.out.println(JSON.toJSONString(testList));
        System.out.println(JSON.toJSONString(subList));*/
    }
}
