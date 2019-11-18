package com.main.learn.effective.twenty;

import java.applet.AudioClip;

/**
 * @author sunlei19
 * @Description TODO
 * @Date 2019/11/9 21:40
 */
public interface Singer {
    AudioClip single(Song s);

    default String name() {
        return "Li Jian";
    }
}
