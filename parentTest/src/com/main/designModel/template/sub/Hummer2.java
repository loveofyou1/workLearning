package com.main.designModel.template.sub;

import com.main.designModel.template.abstractFather.HummerModel;

public class Hummer2 extends HummerModel {
    @Override
    public void start() {
        System.out.println("hummer2 start");
    }

    @Override
    public void alarm() {
        System.out.println("hummer2 alarm");
    }

    @Override
    public void stop() {
        System.out.println("hummer2 stop");
    }

    @Override
    public void engineBoom() {
        System.out.println("hummer2 engineBoom");
    }


}
