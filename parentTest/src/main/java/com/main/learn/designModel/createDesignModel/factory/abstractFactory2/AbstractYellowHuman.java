package com.main.learn.designModel.createDesignModel.factory.abstractFactory2;

/**
 * @author sunlei19
 * @create 2019/2/28
 */
public abstract class AbstractYellowHuman implements Human {
    @Override
    public void color() {
        System.out.println("黄色人种皮肤颜色是黄色的！");
    }

    @Override
    public void talk() {
        System.out.println("黄色人种语言是汉语的多！");
    }

}
