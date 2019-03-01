package com.main.learn.designModel.createDesignModel.builder.service.impl;

import com.main.learn.designModel.createDesignModel.builder.service.Item;
import com.main.learn.designModel.createDesignModel.builder.service.Packing;

public abstract class Burger implements Item {
    @Override
    public Packing paching() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
