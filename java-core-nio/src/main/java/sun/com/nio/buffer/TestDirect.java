package sun.com.nio.buffer;

import java.nio.ByteBuffer;

/**
 * @Description TestDirect
 * @Author sunlei19
 * @Date 2020/8/22 10:00
 * @Version 1.0
 */
public class TestDirect {
    public static void main(String[] args) {
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(100);
        System.out.println("byteBuffer.direct="+byteBuffer.isDirect());
    }
}
