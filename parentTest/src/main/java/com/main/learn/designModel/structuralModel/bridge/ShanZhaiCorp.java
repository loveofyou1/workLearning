package com.main.learn.designModel.structuralModel.bridge;

public class ShanZhaiCorp extends Corp {
    public ShanZhaiCorp(Product product) {
        super(product);
    }

    @Override
    public void makeMoney() {
        super.makeMoney();
        System.out.println("山寨产品赚钱了。。。");
    }
}
