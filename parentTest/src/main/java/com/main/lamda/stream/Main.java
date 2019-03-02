package com.main.lamda.stream;

import java.util.Arrays;
import java.util.List;

/**
 * 流基本的应用
 *
 * @author sunlei19
 * @create 2019/2/25
 */
public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        xunhuan(numbers);
        stream(numbers);
        parallelStream(numbers);
    }

    private static void xunhuan(List<Integer> numbers) {
        int sum = 0;
        for (int n : numbers) {
            if (n % 2 == 1) {
                int square = n * n;
                sum = sum + square;
            }
        }
        System.out.println(sum);
    }

    private static void stream(List<Integer> numbers) {
        int sum = numbers.stream().filter(n -> n % 2 == 1).map(n -> n * n).reduce(0, Integer::sum);
        System.out.println(sum);
    }

    private static void parallelStream(List<Integer> numbers) {
        int sum = numbers.parallelStream().filter(n -> n % 2 == 1).map(n -> n * n).reduce(0, Integer::sum);
        System.out.println(sum);
    }
}
