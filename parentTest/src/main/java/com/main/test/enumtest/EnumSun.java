package com.main.test.enumtest;

public enum EnumSun {
    MON(1, 1), TUE(2, 2), WEN(3, 3), THUR(4), FRI(5), SAT(6) {
        @Override
        public boolean isReset() {
            return true;
        }
    },
    SUN(0) {
        @Override
        public boolean isReset() {
            return true;
        }
    };

    private int value;

    EnumSun(int value) {
        this.value = value;
    }

    private int index;
    private int str;

    EnumSun(int index, int str) {
        this.index = index;
        this.str = str;
    }

    public int getStr() {
        return str;
    }

    public int getValue() {
        return value;
    }

    public boolean isReset() {
        return false;
    }


}
