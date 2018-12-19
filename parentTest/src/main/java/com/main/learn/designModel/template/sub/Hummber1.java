package com.main.learn.designModel.template.sub;

import com.main.learn.designModel.template.abstractFather.HummerModel;

public class Hummber1 extends HummerModel {
    private boolean alarmFlag = true;  //要响喇叭

    @Override
    public void start() {
        System.out.println("hummer1 start");
    }

    @Override
    public void alarm() {
        System.out.println("hummer1 alarm");
    }

    @Override
    public void stop() {
        System.out.println("hummer1 stop");
    }

    @Override
    public void engineBoom() {
        System.out.println("hummer1 engineBoom");
    }

    protected boolean isAlarm() {
        return this.alarmFlag;
    }

    public void setAlarmFlag(boolean alarmFlag) {
        this.alarmFlag = alarmFlag;
    }
}
