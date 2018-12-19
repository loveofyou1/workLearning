package com.main.learn.designModel.builder.goods;

import com.main.learn.designModel.builder.service.impl.ColdDrink;

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
