package com.main.learn.designModel.behavioralModel;

/**
 * 策略模式：
 * 定义一组算法，将每个算法都封装起来，并且使他们之间可以互换。
 *
 * @author sunlei19
 * @create 2019/3/1
 */
public class ZhaoYun {
    public static void main(String[] args) {
        Context context;
        System.out.println("刚到吴国=========");
        context = new Context(new BackDoor());
        context.operate();

        System.out.println("刘备乐不思蜀了，拆第二个===");
        context = new Context(new GivenGreenLight());
        context.operate();

        System.out.println("刘备走不了了，拆第三个===");
        context = new Context(new BlockEnemy());
        context.operate();
    }
}
