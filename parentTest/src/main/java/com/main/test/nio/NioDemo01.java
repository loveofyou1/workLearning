package com.main.test.nio;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @author sunlei19
 * @create 2018-02-27 17:47
 */
public class NioDemo01 {
    public static void main(String[] args) {
        RandomAccessFile afile = null;
        try {
            afile = new RandomAccessFile("src/nio.txt", "rw");
            FileChannel fileChannel = afile.getChannel();
            ByteBuffer buf = ByteBuffer.allocate(1024);

            int byteSize = fileChannel.read(buf);
            System.out.println(byteSize);
            while (byteSize != -1) {
                buf.flip();
                while (buf.hasRemaining()) {
                    System.out.println((char) buf.get());
                }
                buf.compact();
                byteSize = fileChannel.read(buf);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (afile != null) {
                    afile.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
