package com.main.learn.designModel.createDesignModel.factory.factoryMethod;

/**
 * @author sunlei19
 * @create 2019/2/28
 */
public class NvWa {
    public static void main(String[] args) {
        AbstractCreatorFactory factory = new CreatorFactory();
        System.out.println("创建第一批人是白色人种=");
        Human whileHuman = factory.createHuman(WhileHuman.class);
        whileHuman.color();
        whileHuman.talk();
        System.out.println("创建第二批人是黑色人种=");
        Human blackHuman = factory.createHuman(BlackHuman.class);
        blackHuman.color();
        blackHuman.talk();
        System.out.println("创建第三批人是黄色人种=");
        Human yellowHuman = factory.createHuman(YellowHuman.class);
        yellowHuman.color();
        yellowHuman.talk();
    }
}
