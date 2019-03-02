package com.main.learn.designModel.createDesignModel.builder.goods;

import com.main.learn.designModel.createDesignModel.builder.service.impl.ColdDrink;

public class Pepsi extends ColdDrink {
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 35.0f;
    }
}
