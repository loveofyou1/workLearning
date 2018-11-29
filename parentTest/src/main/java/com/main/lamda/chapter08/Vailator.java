package com.main.lamda.chapter08;

/**
 * @author sunlei19
 * @create 2018/11/27
 */
public class Vailator {

    private final ValidatorStrategy validatorStrategy;

    public Vailator(ValidatorStrategy validatorStrategy) {
        this.validatorStrategy = validatorStrategy;
    }

    public boolean validate(String s) {
        return this.validatorStrategy.execute(s);
    }
}
