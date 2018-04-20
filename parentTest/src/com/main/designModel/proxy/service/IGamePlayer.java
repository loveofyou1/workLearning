package com.main.designModel.proxy.service;

/**
 * 玩家接口
 */
public interface IGamePlayer {
    //登录游戏
    public void login(String user,String password);
    //杀怪，网络游戏的主要特色
    public void killBoss();
    //升级
    public void upgrade();
}
