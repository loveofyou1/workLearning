package com.main.test.io.example;

import java.io.*;

/**
 * @author sunlei19
 * @create 2018/7/24
 */
public class FilePrint {
    public static void main(String[] args) {
        /** 一次读取的字符长度，缓存长度*/
        char[] chars = new char[512];
        int number = 0;
        FileReader fileReader = null;
        PrintWriter fileWriter = null;

        try {
            fileReader = new FileReader(new File("d:/a.txt"));
            fileWriter = new PrintWriter(System.out);
            while ((number = fileReader.read(chars)) != -1) {
                fileWriter.write(chars, 0, number);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            fileWriter.close();
        }
    }
}
