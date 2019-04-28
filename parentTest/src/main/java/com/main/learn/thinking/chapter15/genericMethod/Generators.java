package com.main.learn.thinking.chapter15.genericMethod;

import com.main.learn.thinking.chapter15.coffee.Coffee;
import com.main.learn.thinking.chapter15.coffee.CoffeeGenerator;
import com.main.learn.thinking.chapter15.coffee.Fibbonacci;
import com.main.learn.thinking.chapter15.coffee.Generator;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author sunlei19
 * @create 2019/4/28
 */
public class Generators {
    public static <T> Collection<T> fill(Collection<T> coll, Generator<T> gen, int n) {
        for (int i = 0; i < n; i++) {
            coll.add(gen.next());
        }
        return coll;
    }

    public static void main(String[] args) {
        Collection<Coffee> coffees = fill(new ArrayList<Coffee>(), new CoffeeGenerator(), 4);
        for (Coffee coffee : coffees) {
            System.out.println(coffee);
        }

        Collection<Integer> fnumbers = fill(new ArrayList<Integer>(), new Fibbonacci(), 12);
        for (int i : fnumbers) {
            System.out.print(i + ".");
        }
    }
}
