package com.main.learn.designModel.createDesignModel.factory.abstractFactory2;

/**
 * @author sunlei19
 * @create 2019/2/28
 */
public abstract class AbstractBlackHuman implements Human {
    @Override
    public void color() {
        System.out.println("黑色人种的皮肤颜色是黑色的！");
    }

    @Override
    public void talk() {
        System.out.println("黑人会说话，一般人听不懂！");
    }

}
