package com.main.test.io.example;

import java.io.*;

/**
 * @author sunlei19
 * @create 2018/7/24
 */
public class FileCopy {
    public static void main(String[] args) {
        byte[] buffer = new byte[512];
        int numberRead = 0;
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;

        try {
            fileInputStream = new FileInputStream(new File("D:/a.txt"));

            fileOutputStream = new FileOutputStream(new File("D:/b.txt"));

            while ((numberRead = fileInputStream.read(buffer)) != -1) {
                fileOutputStream.write(buffer, 0, numberRead);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
