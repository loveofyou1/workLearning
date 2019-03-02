package com.main.learn.designModel.createDesignModel.builder.goods;

import com.main.learn.designModel.createDesignModel.builder.service.impl.ColdDrink;

public class Coke extends ColdDrink {
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 30.0f;
    }
}
