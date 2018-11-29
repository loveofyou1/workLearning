package com.main.lamda.chapter09;

import java.util.List;

/**
 * @author sunlei19
 * @create 2018/11/28
 */
public class Utils {
    public static void paint(List<Resizable> list) {
        list.forEach(r -> {
            r.setAbsoluteSize(42, 42);
            r.draw();
        });
    }
}
