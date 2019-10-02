package com.main.learn.designModel.observe.impl;

/**
 * @author sunlei19
 * @Description TODO
 * @Date 2019/10/2 16:51
 */
public class Spy extends Thread {

    private HanFeiZi hanFeiZi;

    private LiSi liSi;

    private String type;

    public Spy(HanFeiZi _hanFeiZi, LiSi _liSi, String _type) {
        this.hanFeiZi = _hanFeiZi;
        this.liSi = _liSi;
        this.type = _type;
    }

/*    @Override
    public void run() {
        while (true) {
            //监控是否吃饭
            if ("breakfast".equals(this.type)) {
                // 如果发现韩非子在吃饭
                if (this.hanFeiZi.isHavingFun()) {
                    this.liSi.update("韩非子在吃饭！");
                    //重置，继续监控
                    this.hanFeiZi.setHavingBreakfast(false);
                }
            } else {
                if (this.hanFeiZi.isHavingFun()) {
                    this.liSi.update("韩非子在娱乐");
                    this.hanFeiZi.setHavingFun(false);
                }
            }
        }
    }*/
}
