package com.main.lamda.chapter05;

import com.alibaba.fastjson.JSON;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * 使用流
 *
 * @author sunlei
 */
public class FilterTest {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 1, 3, 3, 2, 4);
        //distinct去重
        numbers.stream().filter(i -> i % 2 == 0).distinct().forEach(System.out::println);
        //limit截短流，指定长度
        List<Integer> limitList = numbers.stream().filter(i -> i % 2 == 0).limit(1).collect(Collectors.toList());
        System.out.println(limitList);
        //skip跳过元素:扔掉前n个元素
        List<Integer> skipList = numbers.stream().filter(i -> i % 2 == 0).skip(2).collect(Collectors.toList());
        System.out.println(skipList);

        /**
         * 映射使用
         */
        List<String> words = Arrays.asList("java 8", "Lambdas", "In", "Action");
        List<Integer> wordLengths = words.stream().map(String::length).collect(Collectors.toList());
        System.out.println(wordLengths);
        //扁平化流
        List<String> flatWords = words.stream().map(w -> w.split("")).flatMap(Arrays::stream).
                distinct().collect(Collectors.toList());
        System.out.println(flatWords);

        List<Integer> numbers1 = Arrays.asList(1, 2, 3);
        List<Integer> numbers2 = Arrays.asList(2, 3);
        List<int[]> pairs = numbers1.stream().flatMap(i -> numbers2.stream().
                filter(j ->
                        (i + j) % 3 == 0).map(j -> new int[]{i, j})
        ).collect(Collectors.toList());
        System.out.println(pairs);

        Optional<Integer> findNumbers = numbers.stream().filter(i -> i > 2).findAny();
        System.out.println(JSON.toJSON(findNumbers));

        Optional<Integer> findAllNumbers = numbers.stream().filter(i -> i > 3).findFirst();
        System.out.println(JSON.toJSONString(findAllNumbers));

        List<Integer> findAllNums = numbers.stream().filter(i -> i > 2).collect(Collectors.toList());
        System.out.println(JSON.toJSONString(findAllNums));

        int sum = numbers.stream().reduce(0, (a, b) -> a + b);
        int sum1 = numbers.stream().reduce(0, Integer::sum);
        Optional<Integer> max = numbers.stream().reduce(Integer::max);
        Optional<Integer> min = numbers.stream().reduce(Integer::min);
        System.out.println(sum + sum1);
        System.out.println(max.get());
        System.out.println(min.get());

    }
}
