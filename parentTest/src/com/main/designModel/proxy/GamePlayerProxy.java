package com.main.designModel.proxy;

import com.main.designModel.proxy.impl.GamePlayer;
import com.main.designModel.proxy.service.IGamePlayer;
import com.main.designModel.proxy.service.IProxy;

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
