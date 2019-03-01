package com.main.learn.designModel.structuralModel.adpter.impl;

import com.main.learn.designModel.structuralModel.adpter.service.IUserInfo;

public class UserInfo implements IUserInfo {
    @Override
    public String getUserName() {
        System.out.println("用户名字");
        return null;
    }

    @Override
    public String getHomeAddress() {
        System.out.println("地址");
        return null;
    }

    @Override
    public String getMobileNumber() {
        System.out.println("移动电话");
        return null;
    }

    @Override
    public String getOfficeTelNumber() {
        System.out.println("办公电话");
        return null;
    }

    @Override
    public String getJobPosition() {
        System.out.println("休闲地址");
        return null;
    }

    @Override
    public String getHomeTelNumber() {
        System.out.println("家庭电话");
        return null;
    }
}
