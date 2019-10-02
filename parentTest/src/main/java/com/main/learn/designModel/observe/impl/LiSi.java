package com.main.learn.designModel.observe.impl;

import com.main.learn.designModel.observe.Observer;

/**
 * @author sunlei19
 * @Description TODO
 * @Date 2019/10/2 16:47
 */
public class LiSi implements Observer {
    @Override
    public void update(String context) {
        System.out.println("李斯：在观察韩非子的活动，开始向老板回报......");
        this.reportToQinShiHuang(context);
        System.out.println("李斯：回报完毕");
    }

    private void reportToQinShiHuang(String report) {
        System.out.println("李斯报告老板，韩非子有活动：" + report);
    }
}
