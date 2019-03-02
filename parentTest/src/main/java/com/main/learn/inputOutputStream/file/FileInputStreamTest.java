package com.main.learn.inputOutputStream.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author sunlei19
 * @create 2019/2/25
 */
public class FileInputStreamTest {
    public static void main(String[] args) {
        String fileName = "dummy.txt";
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(fileName);
            byte byteData;
            while ((byteData = (byte) fileInputStream.read()) != -1) {
                System.out.print((char) byteData);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
