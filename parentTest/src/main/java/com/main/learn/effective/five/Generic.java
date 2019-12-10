package com.main.learn.effective.five;

import java.util.*;

/**
 * @author sunlei19
 * @Description TODO
 * @Date 2019/11/11 01:33
 */
public class Generic {
    private static <E> Set<E> union(Set<? extends E> s1, Set<? extends E> s2) {
        Set<E> result = new HashSet<>(s1);
        result.addAll(s2);
        return result;
    }

    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        set1.add("1");

        Set<String> set2 = new HashSet<>();
        set2.add("2");

        Set<String> set3 = union(set1, set2);

        List<String> list = new ArrayList<>(set3);
        Collections.reverse(list);
        System.out.println(list);
    }
}
