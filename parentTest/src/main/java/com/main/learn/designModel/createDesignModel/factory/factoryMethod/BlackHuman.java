package com.main.learn.designModel.createDesignModel.factory.factoryMethod;

/**
 * @author sunlei19
 * @create 2019/2/28
 */
public class BlackHuman implements Human {
    @Override
    public void color() {
        System.out.println("my is Black");
    }

    @Override
    public void talk() {
        System.out.println("my language is Indian");
    }
}
