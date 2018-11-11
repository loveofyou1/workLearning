package com.main.lamda;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * @author sunlei19
 * @create 2018/11/10
 */
public class JavaEightBegin {
    public static void main(String[] args) {
        List<Apple> list = new ArrayList<>();
        Apple apple1 = new Apple();
        apple1.setColor("blue");
        apple1.setWeight(10);
        list.add(apple1);
        Apple apple2 = new Apple();
        apple2.setColor("blue");
        apple2.setWeight(100);
        list.add(apple2);
        Apple apple3 = new Apple();
        apple3.setColor("red");
        apple3.setWeight(101);
        list.add(apple3);
        Apple apple4 = new Apple();
        apple4.setColor("black");
        apple4.setWeight(102);
        list.add(apple4);

        List<Apple> resultList = filterAppleList(list, (Apple a) -> a.getWeight() > 100);
        System.out.println(JSON.toJSONString(resultList));

        //顺序执行
        List<Apple> heavyList = list.stream().filter((Apple a) -> a.getWeight() > 100).collect(Collectors.toList());
        System.out.println(JSON.toJSONString(heavyList));

        //并行执行
        List<Apple> parallelList = list.parallelStream().filter((Apple a) -> a.getWeight() > 100).collect(Collectors.toList());
        System.out.println(JSON.toJSONString(parallelList));

        //刷选红色和重量大于100的苹果
        List<Apple> redAndHeavyList = list.parallelStream().filter((Apple a) -> a.getWeight() > 100 && a.getColor().equals("red")).collect(Collectors.toList());
        System.out.println(JSON.toJSONString(redAndHeavyList));

        list.sort(Comparator.comparing(Apple::getColor));
        System.out.println(JSON.toJSONString(list));
    }


    static List<Apple> filterAppleList(List<Apple> inventory, Predicate<Apple> p) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if (p.test(apple)) {
                result.add(apple);
            }
        }
        return result;
    }
}

