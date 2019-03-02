package com.main.learn.designModel.createDesignModel.factory.factoryMethod;

/**
 * @author sunlei19
 * @create 2019/2/28
 */
public class YellowHuman implements Human {
    @Override
    public void color() {
        System.out.println( "my is Yellow!");
    }

    @Override
    public void talk() {
        System.out.println( "my language is Chinese!");
    }
}
