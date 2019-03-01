package com.main.learn.designModel.structuralModel.bridge;

public class House extends Product {
    @Override
    public void beProduce() {
        System.out.println("生产出的房子是这样的...");
    }

    @Override
    public void beSell() {
        System.out.println("生产出的房子卖出去了...");
    }
}
