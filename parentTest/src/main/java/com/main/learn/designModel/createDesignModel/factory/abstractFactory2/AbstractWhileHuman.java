package com.main.learn.designModel.createDesignModel.factory.abstractFactory2;

/**
 * @author sunlei19
 * @create 2019/2/28
 */
public abstract class AbstractWhileHuman implements Human {
    @Override
    public void color() {
        System.out.println("白色人种的皮肤颜色是白色的！");
    }

    @Override
    public void talk() {
        System.out.println("白色人种会说话，说的是英语！");
    }
}
