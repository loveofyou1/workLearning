package com.main.learn.designModel.structuralModel.bridge;

public class ClothesCorp extends Corp {

    public ClothesCorp(Product product) {
        super(product);
    }

    @Override
    public void makeMoney() {
        super.makeMoney();
        System.out.println("服装公司赚小钱...");
    }
}
