package com.main.learn.designModel.createDesignModel.builder.service.impl;

import com.main.learn.designModel.createDesignModel.builder.service.Packing;

public class Bottle implements Packing {
    @Override
    public String pack() {
        return "Bottle";
    }
}
