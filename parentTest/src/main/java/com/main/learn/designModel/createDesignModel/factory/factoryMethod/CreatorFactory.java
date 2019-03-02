package com.main.learn.designModel.createDesignModel.factory.factoryMethod;

/**
 * 创建工厂类
 *
 * @author sunlei19
 * @create 2019/2/28
 */
public class CreatorFactory extends AbstractCreatorFactory {
    @Override
    public <T extends Human> T createHuman(Class<T> clazz) {
        Human human = null;
        try {
            human = (T) Class.forName(clazz.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T) human;
    }
}
