package com.main.lamda.chapter10;

import java.util.Optional;

/**
 * @author sunlei19
 * @create 2018/11/29
 */
public class Car {
    public Car(Optional<Insurance> insurance) {
        this.insurance = insurance;
    }

    private Optional<Insurance> insurance;

    public Optional<Insurance> getInsurance() {
        return insurance;
    }
}
