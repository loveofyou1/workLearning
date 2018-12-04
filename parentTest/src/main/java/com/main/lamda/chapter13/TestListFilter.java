package com.main.lamda.chapter13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestListFilter {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 4, 9);
        System.out.println(subSets(list));
    }

    private static List<List<Integer>> subSets(List<Integer> list) {
        if (list.isEmpty()) {
            List<List<Integer>> ans = new ArrayList<>();
            ans.add(list);
            return ans;
        }
        Integer first = list.get(0);
        List<Integer> rest = list.subList(1, list.size());

        List<List<Integer>> subans = subSets(rest);
        List<List<Integer>> subans2 = insertAll(first, subans);
        return concat(subans, subans2);
    }

    private static List<List<Integer>> insertAll(Integer first, List<List<Integer>> subList) {
        List<List<Integer>> tempList = new ArrayList<>();
        for (List<Integer> list : subList) {
            List<Integer> copyList = new ArrayList<>();
            copyList.add(first);
            copyList.addAll(list);
            tempList.add(copyList);
        }
        return tempList;
    }

    private static List<List<Integer>> concat(List<List<Integer>> a, List<List<Integer>> b) {
        List<List<Integer>> result = new ArrayList<>(a);
        result.addAll(b);
        return result;
    }
}
