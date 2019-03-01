package com.main.learn.designModel.behavioralModel;

/**
 * @author sunlei19
 * @create 2019/3/1
 */
public class Context {
    //构造函数，你使用哪个策略
    private IStrategy iStrategy;

    public Context(IStrategy iStrategy) {
        this.iStrategy = iStrategy;
    }

    /**
     * 使用计谋了，看我出招了
     */
    public void operate() {
        this.iStrategy.operate();
    }
}
