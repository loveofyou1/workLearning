package com.main.test.io;

import java.io.File;

/**
 * @author sunlei19
 * @create 2018-02-27 17:05
 */
public class CreateDir {
    public static void main(String[] args) {
        String dirname = "/tmp";
        File dir = new File(dirname);
        //dir.mkdirs();
        if (dir.isDirectory()) {
            System.out.println("目录：" + dirname);
            String[] s = dir.list();
            for (int i = 0; i < s.length; i++) {
                File f = new File(dirname + "/" + s[i]);
                if (f.isDirectory()) {
                    System.out.println(s[i] + "是一个目录。");
                } else {
                    System.out.println(s[i] + "是一个文件");
                }
            }
        } else {
            System.out.println(dirname + "不是一个目录");
        }
    }
}
