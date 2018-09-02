package com.main.test.io;

import java.io.*;

/**
 * @author sunlei19
 * @create 2018-02-27 16:53
 */
public class FileStreamTest2 {
    public static void main(String[] args) throws IOException {
        File file = new File("a.txt");
        FileOutputStream fop = new FileOutputStream(file);

        OutputStreamWriter writer = new OutputStreamWriter(fop, "UTF-8");
        writer.append("中文输入");
        writer.append("\r\n");
        writer.append("English");
        writer.close();

        fop.close();

        FileInputStream fip = new FileInputStream(file);
        InputStreamReader reader = new InputStreamReader(fip, "UTF-8");
        StringBuffer sb = new StringBuffer();
        while (reader.ready()) {
            sb.append((char) reader.read());
        }
        System.out.println(sb.toString());
        reader.close();
        fip.close();
    }
}
