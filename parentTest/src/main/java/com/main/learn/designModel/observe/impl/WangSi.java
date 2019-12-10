package com.main.learn.designModel.observe.impl;

import com.main.learn.designModel.observe.Observer;

/**
 * @author sunlei19
 * @Description TODO
 * @Date 2019/10/2 18:32
 */
public class WangSi implements Observer {
    @Override
    public void update(String context) {
        System.out.println("王斯：观察韩非子活动，自己也开始行动了");
        this.cry(context);
        System.out.println("王斯：行动结束了");
    }

    private void cry(String context) {
        System.out.println(context);
    }
}
