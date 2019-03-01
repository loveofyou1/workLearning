package com.main.learn.designModel.behavioralModel;

/**
 * @author sunlei19
 * @create 2019/3/1
 */
public class GivenGreenLight implements IStrategy {
    @Override
    public void operate() {
        System.out.println("吴国太开绿灯！");
    }
}
