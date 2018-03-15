package com.main.test.io;

import java.io.*;

/**
 * @author sunlei19
 * @create 2018-02-27 16:40
 */
public class FileStreamTest {
    public static void main(String[] args) {
        try {
            byte bWrite[] = {11, 21, 31, 41};
            OutputStream os = new FileOutputStream("test.txt");
            for (int i = 0; i < bWrite.length; i++) {
                os.write(bWrite[i]);
            }
            os.close();

            InputStream in = new FileInputStream("test.txt");
            int size = in.available();
            System.out.println(size);
            for (int j = 0; j < size; j++) {
                System.out.println(in.read() + " ");
            }
            in.close();

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Exception");
        }
    }
}
