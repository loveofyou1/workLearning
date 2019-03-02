package com.main.learn.inputOutputStream;

import java.io.File;
import java.io.IOException;

/**
 * @author sunlei19
 * @create 2019/2/25
 */
public class Main {
    public static void main(String[] args) {
        printFile("dummy.txt");
        printFile(".." + File.separator + "notes.txt");
    }

    private static void printFile(String pathName) {
        File file = new File(pathName);
        System.out.println("file name " + file.getName());
        System.out.println("file exists " + file.exists());
        //绝对路径
        System.out.println("file absolute path " + file.getAbsolutePath());
        try {
            //标准路径
            System.out.println("file canonicalPath path " + file.getCanonicalPath());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
