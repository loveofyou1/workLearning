package com.main.learn.thinking.chapter15;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author sunlei19
 * @create 2019/4/28
 */
public class RandomList<T> {
    private ArrayList<T> storage = new ArrayList<>();
    private Random rand = new Random(47);

    public void add(T item) {
        storage.add(item);
    }

    public T select() {
        return storage.get(rand.nextInt(storage.size()));
    }

    public static void main(String[] args) {
        RandomList<String> rs = new RandomList<>();
        for (String s : ("The quick brown fox jumped over " + "the lazy brown dog").split(" ")) {
            rs.add(s);
        }

        for (int i = 0; i < 11; i++) {
            System.out.println(rs.select() + " ");
        }

        RandomList<Integer> integerRandomList = new RandomList<>();
        List<Integer> list = new ArrayList<>();
        list.add(new Integer(1));
        list.add(new Integer(2));
        list.add(new Integer(3));
        for (Integer s : list) {
            integerRandomList.add(s);
        }

        for (int i = 0; i < 6; i++) {
            System.out.println(integerRandomList.select());
        }
    }
}
