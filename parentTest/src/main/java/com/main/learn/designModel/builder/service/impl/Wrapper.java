package com.main.learn.designModel.builder.service.impl;

import com.main.learn.designModel.builder.service.Packing;

public class Wrapper implements Packing {
    @Override
    public String pack() {
        return "Wrapper";
    }
}
