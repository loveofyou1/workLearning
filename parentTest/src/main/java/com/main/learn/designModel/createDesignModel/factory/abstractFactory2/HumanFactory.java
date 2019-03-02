package com.main.learn.designModel.createDesignModel.factory.abstractFactory2;

/**
 * 人类抽象工厂接口
 *
 * @author sunlei19
 * @create 2019/2/28
 */
public interface HumanFactory {

    Human createWhiteHuman();

    Human createBlackHuman();

    Human createYellowHuman();
}
