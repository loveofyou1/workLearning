package com.main.learn.designModel.bridge;

public class IPod extends Product{
    @Override
    public void beProduce() {
        System.out.println("生产出的iPod是这样的...");
    }

    @Override
    public void beSell() {
        System.out.println("生产出的iPod卖出去了...");
    }
}
