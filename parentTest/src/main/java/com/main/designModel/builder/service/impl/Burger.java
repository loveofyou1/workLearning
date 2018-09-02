package com.main.designModel.builder.service.impl;

import com.main.designModel.builder.service.Item;
import com.main.designModel.builder.service.Packing;

public abstract class Burger implements Item {
    @Override
    public Packing paching() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
