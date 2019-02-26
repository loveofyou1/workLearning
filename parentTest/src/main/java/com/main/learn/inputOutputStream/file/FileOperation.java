package com.main.learn.inputOutputStream.file;

import java.io.File;
import java.io.IOException;

/**
 * @author sunlei19
 * @create 2019/2/25
 */
public class FileOperation {
    public static void main(String[] args) {
        File dummyFile = new File("dummy.txt");
        try {
            boolean fileCreated = dummyFile.createNewFile();
            if (fileCreated) {
                System.out.println("create file success");
            } else {
                System.out.println("create file fail");
            }
            System.out.println(dummyFile.getAbsolutePath());
            File tempFile = File.createTempFile("abc", ".txt");
            System.out.println(tempFile.exists());
            System.out.println(tempFile.getName());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
