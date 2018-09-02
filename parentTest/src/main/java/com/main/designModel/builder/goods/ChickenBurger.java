package com.main.designModel.builder.goods;

import com.main.designModel.builder.service.impl.Burger;

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
