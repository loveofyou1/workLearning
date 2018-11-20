package com.main.lamda.stream;

import com.alibaba.fastjson.JSON;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import static java.util.stream.Collectors.reducing;
import static java.util.stream.Collectors.toList;

/**
 * @author sunlei19
 * @create 2018/11/14
 */
public class StreamTest {
    private static List<Dish> menu = Arrays.asList(
            new Dish("pork", false, 800, Dish.Type.MEAT),
            new Dish("beef", false, 700, Dish.Type.MEAT),
            new Dish("chicken", false, 400, Dish.Type.MEAT),
            new Dish("french fries", true, 500, Dish.Type.MEAT),
            new Dish("rice", true, 300, Dish.Type.MEAT),
            new Dish("season fruit", false, 120, Dish.Type.MEAT),
            new Dish("pizza", true, 550, Dish.Type.MEAT),
            new Dish("prawns", false, 300, Dish.Type.MEAT),
            new Dish("salmon", false, 450, Dish.Type.MEAT)
    );

    public static void main(String[] args) {
        List<String> lowCaloricDishs = menu.stream().filter(dish -> dish.getCalories() < 400).sorted(Comparator.comparing(Dish::getCalories))
                .map(Dish::getName).collect(toList());
        System.out.println(JSON.toJSONString(lowCaloricDishs));

        List<String> lowCaloricsDishs = menu.stream().filter(dish -> dish.getCalories() < 300).sorted(Comparator.comparing(Dish::getCalories))
                .map(Dish::getName).collect(toList());
        System.out.println(JSON.toJSONString(lowCaloricsDishs));

        Optional<Integer> sum = menu.stream().map(Dish::getCalories).reduce(Integer::sum);
        System.out.println(sum.get());

        int totalCalories = menu.stream().mapToInt(Dish::getCalories).sum();
        System.out.println(totalCalories);


    }
}
