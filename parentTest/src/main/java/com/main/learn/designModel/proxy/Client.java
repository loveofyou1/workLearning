package com.main.learn.designModel.proxy;

import com.main.learn.designModel.proxy.dynamicProxy.GamePlayIH;
import com.main.learn.designModel.proxy.impl.GamePlayer;
import com.main.learn.designModel.proxy.service.IGamePlayer;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.Date;

public class Client {
    public static void main(String[] args) {
        IGamePlayer player = new GamePlayer("张三");

        //定义一个handler
        InvocationHandler invocationHandler = new GamePlayIH(player);

        System.out.println(new Date());

        //获取类的classloader
        ClassLoader classLoader = player.getClass().getClassLoader();

        //动态产生一个代理者
        IGamePlayer proxy = (IGamePlayer) Proxy.newProxyInstance(classLoader, new Class[]{IGamePlayer.class}, invocationHandler);

        //登陆
        proxy.login("su", "su");

        proxy.killBoss();

        proxy.upgrade();

        System.out.println(new Date());
    }
}
