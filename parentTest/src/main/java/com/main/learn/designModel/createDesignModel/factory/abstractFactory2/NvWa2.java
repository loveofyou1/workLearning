package com.main.learn.designModel.createDesignModel.factory.abstractFactory2;

/**
 * 抽象工厂模式：
 * 为创建一组相关或相互依赖的对象提供一个接口，而且无需指定他们的具体类。
 *
 * @author sunlei19
 * @create 2019/2/28
 */
public class NvWa2 {
    public static void main(String[] args) {
        HumanFactory femaleFactory = new FemaleFactory();

        Human white = femaleFactory.createWhiteHuman();
        white.color();
        white.talk();
        white.sex();

        Human black = femaleFactory.createBlackHuman();
        black.color();
        black.talk();
        black.sex();

        Human yellow = femaleFactory.createYellowHuman();
        yellow.color();
        yellow.talk();
        yellow.sex();
    }
}
