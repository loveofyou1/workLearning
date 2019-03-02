package com.main.learn.designModel.createDesignModel.prototype;

/**
 * @author sunlei19
 * @create 2019/3/1
 */
public class Thing implements Cloneable {
    public Thing() {
        System.out.println("构造函数被执行了！");
    }

    @Override
    public Thing clone() {
        Thing thing = null;
        try {
            thing = (Thing) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return thing;
    }
}
