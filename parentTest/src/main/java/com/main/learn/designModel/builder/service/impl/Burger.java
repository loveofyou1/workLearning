package com.main.learn.designModel.builder.service.impl;

import com.main.learn.designModel.builder.service.Item;
import com.main.learn.designModel.builder.service.Packing;

public abstract class Burger implements Item {
    @Override
    public Packing paching() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
