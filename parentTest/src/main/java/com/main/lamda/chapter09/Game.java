package com.main.lamda.chapter09;

import java.util.Arrays;
import java.util.List;

/**
 * @author sunlei19
 * @create 2018/11/28
 */
public class Game {
    public static void main(String[] args) {
        List<Resizable> resizableList = Arrays.asList(new Ellipse(), new Square());
        resizableList.stream().map(resizable -> resizable.getHeight());

        MultiImpl test = new MultiImpl();
        test.setRelativeSize(10, 10);
        test.isEmpty();
    }
}
