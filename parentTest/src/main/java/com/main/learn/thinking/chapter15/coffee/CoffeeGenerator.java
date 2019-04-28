package com.main.learn.thinking.chapter15.coffee;

import java.util.Iterator;
import java.util.Random;

/**
 * @author sunlei19
 * @create 2019/4/28
 */
public class CoffeeGenerator implements Generator<Coffee>, Iterable<Coffee> {

    private Class[] types = {Latte.class, Mocha.class, Cappuccino.class, Americano.class, Breve.class};

    private static Random rand = new Random(47);

    public CoffeeGenerator() {
    }

    private int size = 0;

    public CoffeeGenerator(int sz) {
        size = sz;
    }

    @Override
    public Coffee next() {
        try {
            return (Coffee) types[rand.nextInt(types.length)].newInstance();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Iterator<Coffee> iterator() {
        return new CoffeeIterator();
    }

    class CoffeeIterator implements Iterator<Coffee> {
        private int count = size;

        public boolean hasNext() {
            return count > 0;
        }

        public Coffee next() {
            count--;
            return CoffeeGenerator.this.next();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public static void main(String[] args) {
        CoffeeGenerator generator = new CoffeeGenerator();
        for (int i = 0; i < 5; i++) {
            System.out.println(generator.next());
        }

        for (Coffee c : new CoffeeGenerator(5)) {
            System.out.println(c);
        }
    }
}
