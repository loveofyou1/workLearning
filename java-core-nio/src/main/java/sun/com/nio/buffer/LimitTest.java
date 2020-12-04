package sun.com.nio.buffer;

import java.nio.CharBuffer;

/**
 * @Description LimitTest
 * @Author sunlei19
 * @Date 2020/8/21 9:15
 * @Version 1.0
 */
public class LimitTest {

    public static void main(String[] args) {
        char[] chars = new char[]{'1', '2', '3', '4' };
        CharBuffer charBuffer = CharBuffer.allocate(10);
        charBuffer = charBuffer.wrap(chars);
        System.out.println("capacity=" + charBuffer.capacity() + " limit=" + charBuffer.limit());

        // 设置limit
        charBuffer.limit(4);
        System.out.println("capacity=" + charBuffer.capacity() + " limit=" + charBuffer.limit() + " data=" + charBuffer.get());

        //charBuffer.put(3, 'a');

        charBuffer.position(2);
        System.out.println("capacity=" + charBuffer.capacity() + " limit=" + charBuffer.limit() + " position=" + charBuffer.position());

        charBuffer.put('x');
        System.out.println("capacity=" + charBuffer.capacity() + " limit=" + charBuffer.limit() + " position=" + charBuffer.position() + " remaining=" + charBuffer.remaining());

        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }


    }
}
