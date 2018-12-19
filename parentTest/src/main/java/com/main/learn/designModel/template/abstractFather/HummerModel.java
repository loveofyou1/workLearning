package com.main.learn.designModel.template.abstractFather;

/**
 * 悍马车抽象类
 */
public abstract class HummerModel {

    public abstract void start();

    public abstract void alarm();

    public abstract void stop();

    public abstract void engineBoom();

    public void run() {
        start();

        engineBoom();

        if (this.isAlarm()) {
            alarm();
        }

        stop();
    }

    //钩子方法，用来影响模板方法的运行结果
    protected boolean isAlarm() {
        return true;
    }
}
