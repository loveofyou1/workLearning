package com.main.learn.refactoring.chapter8;

public class IntRange {

    public IntRange(int _low, int _high) {
        initialize(_low, _high);
    }

    private void initialize(int _low, int _high) {
        this._low = _low;
        this._high = _high;
    }

    boolean includs(int arg) {

        return arg >= _low && arg <= _high;
    }

    void grow(int factor) {
        set_high(get_high() * factor);
    }

    private int _low, _high;

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
