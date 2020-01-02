package com.main.learn.threads.exercise.core.three.size5;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sunlei19
 * @Description TODO
 * @Date 2020/1/1 09:35
 */
public class MyList {
    private static List<String> list = new ArrayList<>();

    public static void add() {
        list.add("addString");
    }

    public static int size() {
        return list.size();
    }
}
