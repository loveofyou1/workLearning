package com.main.learn.designModel.createDesignModel.factory.abstractFactory2;

/**
 * 男性抽象工厂类，是人类工厂的子实体
 *
 * @author sunlei19
 * @create 2019/2/28
 */
public class MaleFactory implements HumanFactory {
    @Override
    public Human createWhiteHuman() {
        return new MaleWhileHuman();
    }

    @Override
    public Human createBlackHuman() {
        return new MaleBlackHuman();
    }

    @Override
    public Human createYellowHuman() {
        return new MaleYellowHuman();
    }
}
