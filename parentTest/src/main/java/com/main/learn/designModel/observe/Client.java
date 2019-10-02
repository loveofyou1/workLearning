package com.main.learn.designModel.observe;

import com.main.learn.designModel.observe.impl.HanFeiZi;
import com.main.learn.designModel.observe.impl.LiSi;
import com.main.learn.designModel.observe.impl.WangSi;

/**
 * @author sunlei19
 * @Description TODO
 * @Date 2019/10/2 17:09
 */
public class Client {
    public static void main(String[] args) {

        HanFeiZi hanFeiZi = new HanFeiZi();
        hanFeiZi.addObserver(new LiSi());
        hanFeiZi.addObserver(new WangSi());

        hanFeiZi.haveBreakfast();
        hanFeiZi.haveFun();
    }
}
