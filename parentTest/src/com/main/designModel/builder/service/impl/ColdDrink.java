package com.main.designModel.builder.service.impl;

import com.main.designModel.builder.service.Item;
import com.main.designModel.builder.service.Packing;

public abstract class ColdDrink implements Item {

    @Override
    public Packing paching() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
