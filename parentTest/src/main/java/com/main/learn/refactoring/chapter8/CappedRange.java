package com.main.learn.refactoring.chapter8;

public class CappedRange extends IntRange {

    private int _cap;

    public CappedRange(int _low, int _high, int cap) {
        super(_low, _high);
        _cap = cap;
    }

    public int get_cap() {
        return _cap;
    }

    public void set_cap(int _cap) {
        this._cap = _cap;
    }

    public int get_high() {
        return Math.min(super.get_high(), get_cap());
    }
}
