package com.main.learn.designModel.behavioralModel;

/**
 * @author sunlei19
 * @create 2019/3/1
 */
public class BackDoor implements IStrategy {
    @Override
    public void operate() {
        System.out.println("找乔国老开后门");
    }
}
