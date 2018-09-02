package com.main.test.io.example;


import java.io.*;

/**
 * @author sunlei19
 * @create 2018/7/24
 */
public class FileCount {
    public static void main(String[] args) {
        /**
         * 我们写一个检测文件长度的小程序，别看这个程序挺长的，你忽略try catch块后发现也就那么几行而已。
         */

        int count = 0;
        InputStream streamReader = null;
        try {
            streamReader = new FileInputStream(new File("d:/a.txt"));
            byte[] bytes = new byte[streamReader.available()];
            while (streamReader.read(bytes) != -1) {
                count++;
            }
            count = bytes.length;
            System.out.println("长度：" + count);
            System.out.println(new String(bytes));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                streamReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
