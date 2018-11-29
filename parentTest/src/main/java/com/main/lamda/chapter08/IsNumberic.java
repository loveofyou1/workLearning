package com.main.lamda.chapter08;

/**
 * @author sunlei19
 * @create 2018/11/27
 */
public class IsNumberic implements ValidatorStrategy {
    @Override
    public boolean execute(String s) {
        return s.matches("\\d+");
    }
}
