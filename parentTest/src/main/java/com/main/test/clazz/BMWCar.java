package com.main.test.clazz;

/**
 * @author sunlei19
 * @create 2019/8cd/28
 */
interface Car {
    void drive();
}

public class BMWCar implements Car {
    private String name;

    public BMWCar() {
        name = "宝马";
    }

    @Override
    public void drive() {
        System.out.println(name);
    }
}
