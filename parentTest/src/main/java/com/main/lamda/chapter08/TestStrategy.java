package com.main.lamda.chapter08;

/**
 * @author sunlei19
 * @create 2018/11/27
 */
public class TestStrategy {
    public static void main(String[] args) {
        //传统策略模式使用方式
        Vailator numbericValidator = new Vailator(new IsNumberic());
        boolean b1 = numbericValidator.validate("aaaa");
        Vailator isAllValidator = new Vailator(new IsAllLowerCase());
        boolean b2 = isAllValidator.validate("Abb");

        System.out.println(b1);
        System.out.println(b2);

        //使用lambda表达式
        Vailator lowcase = new Vailator((String s)-> s.matches("[a-z]+"));
        System.out.println(lowcase.validate("bbb"));
        Vailator numberic = new Vailator((String s) -> s.matches("\\d+"));
        System.out.println(numberic.validate("123"));
    }
}
