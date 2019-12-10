package com.main.learn.designModel.observe.impl;

import com.google.common.collect.Lists;
import com.main.learn.designModel.observe.IHanFeiZi;
import com.main.learn.designModel.observe.Observable;
import com.main.learn.designModel.observe.Observer;

import java.util.List;

/**
 * @author sunlei19
 * @Description 韩非子实现类
 * @Date 2019/10/2 16:41
 */
public class HanFeiZi implements Observable, IHanFeiZi {
    private List<Observer> observerList = Lists.newArrayList();

    private Observer liSi = new LiSi();

    @Override
    public void haveBreakfast() {
        System.out.println("韩非子开始吃饭了.....");
        this.notifyObservers("韩非子吃饭");
    }

    @Override
    public void haveFun() {
        System.out.println("韩非子开始娱乐了......");
        this.notifyObservers("韩非子娱乐");
    }

    @Override
    public void addObserver(Observer observer) {
        if (observer != null) {
            this.observerList.add(observer);
        }
    }

    @Override
    public void deleteObserver(Observer observer) {
        this.observerList.remove(observer);
    }

    @Override
    public void notifyObservers(String context) {
        for (Observer observer : this.observerList) {
            observer.update(context);
        }
    }
}
