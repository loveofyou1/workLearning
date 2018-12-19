package com.main.learn.designModel.builder.goods;

import com.main.learn.designModel.builder.service.impl.Burger;

public class VegBurger extends Burger {
    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
