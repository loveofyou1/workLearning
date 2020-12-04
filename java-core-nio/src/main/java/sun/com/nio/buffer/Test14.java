package sun.com.nio.buffer;

import java.nio.ByteBuffer;

/**
 * @Description Test14
 * @Author sunlei19
 * @Date 2020/8/22 10:46
 * @Version 1.0
 */
public class Test14 {
    public static void main(String[] args) {
        byte[] bytes = new byte[]{1, 2, 3, 4, 5};
        ByteBuffer byteBuffer = ByteBuffer.wrap(bytes);
        System.out.println("byteBuffer.position=" + byteBuffer.position() + " byteBuffer.limit=" + byteBuffer.limit() + " byteBuffer.capacity=" + byteBuffer.capacity());

        byteBuffer.position(1);
        byteBuffer.limit(3);
        byteBuffer.mark();
        System.out.println("byteBuffer.position=" + byteBuffer.position() + " byteBuffer.limit=" + byteBuffer.limit() + " byteBuffer.capacity=" + byteBuffer.capacity());

        byteBuffer.rewind();
        System.out.println("byteBuffer.position=" + byteBuffer.position() + " byteBuffer.limit=" + byteBuffer.limit() + " byteBuffer.capacity=" + byteBuffer.capacity());


    }
}
