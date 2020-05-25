package com.main.learn.refactoring.chapter6;

/**
 * 引入解释变量
 */
public class IntroduceExplainingVariable {

    void relaxMethod() {
        String perform = "MacMACnihaod";
        String browser = "IECHROME";
        int resize = 1;

        if ((perform.toUpperCase().indexOf("MAC") > -1) &&
                (browser.toUpperCase().indexOf("IE") > -1) &&
                (wasInitialized() && resize > 0)) {
            // do something
        }
    }


    boolean wasInitialized() {
        return true;
    }


    // 重构后
    void relaxNewMethod() {
        String perform = "MacMACnihaod";
        String browser = "IECHROME";
        int resize = 1;

        final boolean mac = perform.toUpperCase().indexOf("MAC") > -1;
        final boolean ie = browser.toUpperCase().indexOf("IE") > -1;
        final boolean wasResize = resize > 0;
        if (mac && ie && wasInitialized() && wasResize) {
            // do something
        }
    }
}
