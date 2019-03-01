package com.main.learn.designModel.createDesignModel.factory.factoryMethod;

/**
 * @author sunlei19
 * @create 2019/2/28
 */
public class WhileHuman implements Human {
    @Override
    public void color() {
        System.out.println( "my is White!");
    }

    @Override
    public void talk() {
        System.out.println( "my language is English");
    }
}
