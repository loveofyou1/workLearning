package com.main.learn.refactoring.chapter6;

/**
 * 内连函数
 */
public class InlineMethod {

    int _numberOfLateDeliveries = 10;
    // 初始版本
/*    int getRating() {
        return moreThanFiveLateDeliveries() ? 2 : 1;
    }

    boolean moreThanFiveLateDeliveries() {
        return _numberOfLateDeliveries > 5;
    }*/


    // 内连函数后版本
    int getRating() {
        return _numberOfLateDeliveries > 5 ? 2 : 1;
    }

}
