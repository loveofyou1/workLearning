package com.main.learn.refactoring.chapter8;

/**
 * 自封装字段
 */
public class SelfEncapsulateField {

    private int _low, _high;

    // old
    boolean includes(int arg) {
        return arg >= _low && arg <= _high;
    }

    // new
    boolean newIncludes(int arg) {
        return arg >= get_low() && arg <= get_high();
    }

    public int get_low() {
        return _low;
    }

    public void set_low(int _low) {
        this._low = _low;
    }

    public int get_high() {
        return _high;
    }

    public void set_high(int _high) {
        this._high = _high;
    }
}
