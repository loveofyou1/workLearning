package com.main.learn.designModel.createDesignModel.factory.abstractFactory2;

/**
 * 女性抽象工厂类，是人类工厂的子实体
 *
 * @author sunlei19
 * @create 2019/2/28
 */
public class FemaleFactory implements HumanFactory {
    @Override
    public Human createWhiteHuman() {
        return new FemaleWhileHuman();
    }

    @Override
    public Human createBlackHuman() {
        return new FemaleBlackHuman();
    }

    @Override
    public Human createYellowHuman() {
        return new FemaleYellowHuman();
    }
}
