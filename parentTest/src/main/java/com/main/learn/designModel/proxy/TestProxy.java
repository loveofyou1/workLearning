package com.main.learn.designModel.proxy;

import com.main.learn.designModel.proxy.impl.GamePlayer;

public class TestProxy {
    public static void main(String[] args) {
        GamePlayerProxy proxy = new GamePlayerProxy(new GamePlayer("土拨鼠一号"));
        proxy.login("sun", "sun");
        proxy.killBoss();
        proxy.upgrade();

        //优化后一
        GamePlayerProxy playerProxy = new GamePlayerProxy("楚枫");
        playerProxy.login("sun", "sun");
        playerProxy.killBoss();
        playerProxy.upgrade();
        playerProxy.count();
    }

}
