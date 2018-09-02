package com.main.test.io;

import java.io.*;

/**
 * @author sunlei19
 * @create 2018-02-27 15:16
 */
public class IoDemo02 {
    public static void main(String[] args) throws IOException {
        /**
         * 字节流数据读写，第一种方式
         */
        FileInputStream inputStream = new FileInputStream("E://io.txt");
        FileOutputStream outputStream = new FileOutputStream("E://2.txt");
        int len;
        System.out.println(System.currentTimeMillis());
        while ((len = inputStream.read()) != -1) {
            outputStream.write(len);
        }

        System.out.println(System.currentTimeMillis());

        inputStream.close();
        outputStream.close();


        /**
         * 第二种方式
         */
        FileInputStream inputStream1 = new FileInputStream("E://io.txt");
        FileOutputStream outputStream1 = new FileOutputStream("E://1.txt");
        int len1;
        byte[] bs = new byte[1024];
        long begin1 = System.currentTimeMillis();
        while ((len1 = inputStream1.read(bs)) != -1) {
            outputStream1.write(bs, 0, len1);
        }
        System.out.println(System.currentTimeMillis() - begin1);
        inputStream1.close();
        outputStream1.close();

        /**
         * 第三种方式
         */
        FileInputStream inputStream3 = new FileInputStream("E://io.txt");
        BufferedInputStream bis = new BufferedInputStream(inputStream3);
        FileOutputStream outputStream3 = new FileOutputStream("E://1.txt");
        BufferedOutputStream bos = new BufferedOutputStream(outputStream3);
        int len2;
        byte[] bs2 = new byte[1024];
        long begin2 = System.currentTimeMillis();
        while ((len2 = bis.read()) != -1) {
            bos.write(bs, 0, len2);
        }
        System.out.println(System.currentTimeMillis() - begin2);
        bis.close();
        bos.close();
    }
}
