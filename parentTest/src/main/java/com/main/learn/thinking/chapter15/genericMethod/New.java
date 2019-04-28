package com.main.learn.thinking.chapter15.genericMethod;

import java.util.*;

/**
 * @author sunlei19
 * @create 2019/4/28
 */
public class New {
    public static <K, V> Map<K, V> map() {
        return new HashMap<>();
    }

    public static <T> List<T> list() {
        return new ArrayList<>();
    }

    public static <T> LinkedList<T> linkedList() {
        return new LinkedList<>();
    }

    public static <T> Set<T> set() {
        return new HashSet<>();
    }

    public static <T> Queue<T> queue() {
        return new LinkedList<>();
    }

    public static void main(String[] args) {
        Map<String, String> map = New.map();
        List<String> ls = New.list();
        LinkedList<String> lls = New.linkedList();
        Set<String> set = New.set();
        Queue<String> qs = New.queue();
    }
}
