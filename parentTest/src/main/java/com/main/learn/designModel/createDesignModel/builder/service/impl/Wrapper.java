package com.main.learn.designModel.createDesignModel.builder.service.impl;

import com.main.learn.designModel.createDesignModel.builder.service.Packing;

public class Wrapper implements Packing {
    @Override
    public String pack() {
        return "Wrapper";
    }
}
