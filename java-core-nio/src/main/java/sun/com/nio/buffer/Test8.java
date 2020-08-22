package sun.com.nio.buffer;

import java.nio.ByteBuffer;

/**
 * @Description Test8
 * @Author sunlei19
 * @Date 2020/8/22 10:03
 * @Version 1.0
 */
public class Test8 {
    public static void main(String[] args) {
        byte[] bytes = new byte[]{1, 2, 3};
        ByteBuffer byteBuffer = ByteBuffer.wrap(bytes);
        byteBuffer.position(2);
        byteBuffer.limit(3);
        byteBuffer.mark();
        byteBuffer.clear();
        System.out.println("byteBuffer.position=" + byteBuffer.position());
        System.out.println("byteBuffer.limit=" + byteBuffer.limit());

        try {
            byteBuffer.reset();
        } catch (Exception e) {
            System.out.println("byteBuffer mark 丢失");
        }
    }
}
