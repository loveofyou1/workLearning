package com.main.lamda.function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * @author sunlei19
 * @create 2018/11/12
 */
public class TestDefaultFunction {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(filter(list, (Integer i) -> i >= 2));

        forEach(list, (Integer j) -> System.out.println(j));

        List<Integer> list1 = map(Arrays.asList("lamdbas", "in", "action"), (String s) -> s.length());
        System.out.println(list1);
    }

    /**
     * Predicate判断boolean值
     *
     * @param list
     * @param p
     * @param <T>
     * @return
     */
    public static <T> List<T> filter(List<T> list, Predicate<T> p) {
        List<T> results = new ArrayList<>();
        for (T t : list) {
            if (p.test(t)) {
                results.add(t);
            }
        }
        return results;
    }

    /**
     * Consumer没有返回值操作
     *
     * @param list
     * @param consumer
     * @param <T>
     */
    private static <T> void forEach(List<T> list, Consumer<T> consumer) {
        for (T i : list) {
            consumer.accept(i);
        }
    }

    /**
     * Function将输入对象输出映射到另一个对象
     *
     * @param list
     * @param function
     * @param <T>
     * @param <R>
     * @return
     */
    private static <T, R> List<R> map(List<T> list, Function<T, R> function) {
        List<R> results = new ArrayList<>();
        for (T r : list) {
            results.add(function.apply(r));
        }
        return results;
    }

}
