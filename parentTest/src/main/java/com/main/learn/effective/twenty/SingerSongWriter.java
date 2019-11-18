package com.main.learn.effective.twenty;

import java.applet.AudioClip;

/**
 * @author sunlei19
 * @Description TODO
 * @Date 2019/11/9 21:43
 */
public interface SingerSongWriter extends Singer, SongWriter {
    AudioClip strum();

    void actSensitive();
}
