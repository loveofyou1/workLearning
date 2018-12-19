package com.main.learn.designModel.builder.goods;

import com.main.learn.designModel.builder.service.impl.Burger;

public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "Chichen Burger";
    }

    @Override
    public float price() {
        return 50.5f;
    }
}
