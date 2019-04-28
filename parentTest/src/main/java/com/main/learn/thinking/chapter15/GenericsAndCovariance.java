package com.main.learn.thinking.chapter15;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sunlei19
 * @create 2019/4/28
 */
public class GenericsAndCovariance {
    public static void main(String[] args) {
        List<? extends Number> flist = new ArrayList<Number>();
        //flist.add(new Integer(1));
        flist.add(null);
        System.out.println(flist.get(0));
    }
}
