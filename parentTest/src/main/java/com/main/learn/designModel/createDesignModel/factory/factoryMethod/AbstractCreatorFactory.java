package com.main.learn.designModel.createDesignModel.factory.factoryMethod;

/**
 * 抽象创建类
 *
 * @author sunlei19
 * @create 2019/2/28
 */
public abstract class AbstractCreatorFactory {

    public abstract <T extends Human> T createHuman(Class<T> clazz);
}
