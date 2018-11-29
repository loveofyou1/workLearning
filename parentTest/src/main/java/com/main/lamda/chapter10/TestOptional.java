package com.main.lamda.chapter10;

import java.util.Optional;

/**
 * @author sunlei19
 * @create 2018/11/29
 */
public class TestOptional {
    public static void main(String[] args) {
        Insurance insurance = new Insurance("sun");
        Car car = new Car(Optional.of(insurance));
        Person person = new Person(Optional.of(car));
        String insuranceName = person.getCar().flatMap(Car::getInsurance).map(Insurance::getName).orElse("Unknown");
        System.out.println(insuranceName);

        try {
            Long sum = Long.valueOf("2407223");
            System.out.println(sum);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
