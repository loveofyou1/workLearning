package sun.com.nio.buffer;

import java.nio.ByteBuffer;

/**
 * @Description Test5
 * @Author sunlei19
 * @Date 2020/8/22 9:43
 * @Version 1.0
 */
public class Test5 {
    public static void main(String[] args) {
        byte[] bytes = new byte[]{1, 2, 3};
        ByteBuffer byteBuffer = ByteBuffer.wrap(bytes);
        System.out.println("byteBuffer.capacity=" + byteBuffer.capacity());

        byteBuffer.position(1);
        byteBuffer.mark();

        System.out.println("byteBuffer.position=" + byteBuffer.position());
        byteBuffer.position(2);
        byteBuffer.reset();

        // 回到位置为1处
        System.out.println("byteBuffer.position=" + byteBuffer.position());
        System.out.println("byteBuffer.isOnlyRead="+byteBuffer.isReadOnly());
        System.out.println("byteBuffer.isDirect="+byteBuffer.isDirect());
        ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        System.out.println("byteBuffer.isOnlyRead="+asReadOnlyBuffer.isReadOnly());
    }
}
