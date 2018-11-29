package com.main.lamda.chapter10;

import java.util.Optional;

/**
 * @author sunlei19
 * @create 2018/11/29
 */
public class Person {
    public Person(Optional<Car> car) {
        this.car = car;
    }

    private Optional<Car> car;

    public Optional<Car> getCar() {
        return car;
    }
}
