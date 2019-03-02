package com.main.learn.designModel.structuralModel.proxy.impl;

import com.main.learn.designModel.structuralModel.proxy.service.IGamePlayer;

public class GamePlayer implements IGamePlayer {

    private String name = null;

    public GamePlayer(String name) {
        this.name = name;
    }

    @Override
    public void login(String user, String password) {
        System.out.println(this.name + "user:" + user + ";password:" + password);
    }

    @Override
    public void killBoss() {
        System.out.println(this.name + " kill boss");
    }

    @Override
    public void upgrade() {
        System.out.println(this.name + " upgrade success!");
    }
}
