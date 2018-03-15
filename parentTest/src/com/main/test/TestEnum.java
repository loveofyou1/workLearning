package com.main.test;

import com.main.test.enumtest.EnumSun;

import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Iterator;

public class TestEnum {
    public static void main(String[] args) {
        System.out.println(EnumSun.valueOf("FRI"));

        for (EnumSun e : EnumSun.values()) {
            System.out.println(e.toString());
        }

        EnumSun test = EnumSun.TUE;
        switch (test) {
            case MON:
                System.out.println("今天是星期一");
                break;
            case TUE:
                System.out.println("今天是星期二");
                break;
            // ... ...
            default:
                System.out.println(test);
                break;
        }


        EnumSun test1 = EnumSun.TUE;

        //compareTo(E o)
        switch (test1.compareTo(EnumSun.MON)) {
            case -1:
                System.out.println("TUE 在 MON 之前");
                break;
            case 1:
                System.out.println("TUE 在 MON 之后");
                break;
            default:
                System.out.println("TUE 与 MON 在同一位置");
                break;
        }

        //getDeclaringClass()
        System.out.println("getDeclaringClass(): " + test1.getDeclaringClass().getName());

        //name() 和  toString()
        System.out.println("name(): " + test1.name());
        System.out.println("toString(): " + test1.toString());

        //ordinal()， 返回值是从 0 开始
        System.out.println("ordinal(): " + test1.ordinal());

        System.out.println(EnumSun.MON.getValue());
        System.out.println(EnumSun.MON.isReset());
        System.out.println(EnumSun.WEN.getStr());

        EnumSet<EnumSun> set = EnumSet.allOf(EnumSun.class);
        EnumSet<EnumSun> testset = EnumSet.of(EnumSun.MON, EnumSun.SAT);
        for (EnumSun sun : testset) {
            System.out.println(sun.getStr());
        }
        for (EnumSun day : set) {
            System.out.println(day);
        }

        EnumMap<EnumSun, String> map = new EnumMap<EnumSun, String>(EnumSun.class);
        map.put(EnumSun.THUR, "周四");
        map.put(EnumSun.SUN, "周日");
        for (Iterator iterator = map.entrySet().iterator(); iterator.hasNext(); ) {
            System.out.println(iterator.next());
        }

    }
}
