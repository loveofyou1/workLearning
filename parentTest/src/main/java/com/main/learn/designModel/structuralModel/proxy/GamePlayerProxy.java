package com.main.learn.designModel.structuralModel.proxy;

import com.main.learn.designModel.structuralModel.proxy.impl.GamePlayer;
import com.main.learn.designModel.structuralModel.proxy.service.IGamePlayer;
import com.main.learn.designModel.structuralModel.proxy.service.IProxy;

public class GamePlayerProxy implements IGamePlayer, IProxy {

    private IGamePlayer iGamePlayer = null;

    public GamePlayerProxy(IGamePlayer gamePlayer) {
        iGamePlayer = gamePlayer;
    }

    public GamePlayerProxy(String name1) {
        try {
            iGamePlayer = new GamePlayer(name1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void login(String user, String password) {
        iGamePlayer.login(user, password);
    }

    @Override
    public void killBoss() {
        iGamePlayer.killBoss();
    }

    @Override
    public void upgrade() {
        iGamePlayer.upgrade();
    }

    @Override
    public void count() {
        System.out.println("count is five dollar");
    }
}
