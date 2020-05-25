package sun.com.nio;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @Description FileReadTest
 * @Author sunlei19
 * @Date 2020/5/18 11:41
 * @Version 1.0
 */
public class FileReadTest {

    public static void method2() {
        InputStream in = null;
        try {
            in = new BufferedInputStream(new FileInputStream("D:\\b.txt"));
            byte[] buf = new byte[1024];
            int bytesRead = in.read(buf);
            while (bytesRead != -1) {
                for (int i = 0; i < bytesRead; i++)
                    System.out.print((char) buf[i]);
                bytesRead = in.read(buf);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }


    public static void method1() {
        RandomAccessFile aFile = null;
        try {
            aFile = new RandomAccessFile("D:\\b.txt", "rw");
            FileChannel fileChannel = aFile.getChannel();
            ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
            int bytesRead = fileChannel.read(byteBuffer);
            System.out.println(bytesRead);
            while (bytesRead != -1) {
                byteBuffer.flip();
                while (byteBuffer.hasRemaining()) {
                    System.out.print((char) byteBuffer.get());
                }
                byteBuffer.compact();
                bytesRead = fileChannel.read(byteBuffer);

            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (aFile != null) {
                    aFile.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        method1();
        //method2();
    }
}
