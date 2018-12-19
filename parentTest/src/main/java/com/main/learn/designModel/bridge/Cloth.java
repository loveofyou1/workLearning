package com.main.learn.designModel.bridge;

public class Cloth extends Product {
    @Override
    public void beProduce() {
        System.out.println("服装这样生产了。。");
    }

    @Override
    public void beSell() {
        System.out.println("服装都卖出去了");
    }
}
