package com.main.learn.effective.twenty;

import java.applet.AudioClip;

/**
 * @author sunlei19
 * @Description TODO
 * @Date 2019/11/9 21:56
 */
public class NewSinger implements SingerSongWriter {
    @Override
    public AudioClip strum() {
        return null;
    }

    @Override
    public void actSensitive() {

    }

    @Override
    public AudioClip single(Song s) {
        return null;
    }

    @Override
    public Song compose(int chartPosition) {
        return null;
    }

    public static void main(String[] args) {
        Singer singer = new NewSinger();
        System.out.println(singer.name());
    }
}
