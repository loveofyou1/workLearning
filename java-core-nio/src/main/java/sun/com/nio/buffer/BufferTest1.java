package sun.com.nio.buffer;

import java.nio.*;

/**
 * @Description BufferTest1
 * @Author sunlei19
 * @Date 2020/8/21 8:58
 * @Version 1.0
 */
public class BufferTest1 {
    public static void main(String[] args) {
        byte[] bytes = new byte[]{1, 2, 3, 4};
        char[] chars = new char[]{'1', '2', '3', '4' };
        int[] ints = new int[]{1, 2, 3, 4};
        float[] floats = new float[]{1, 2, 3, 4, 5, 6};
        double[] doubles = new double[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        long[] longs = new long[]{1, 2, 3, 4, 5, 6};
        short[] shorts = new short[]{1, 2, 3, 4, 5, 6};

        ByteBuffer byteBuffer = ByteBuffer.wrap(bytes);
        CharBuffer charBuffer = CharBuffer.wrap(chars);
        IntBuffer intBuffer = IntBuffer.wrap(ints);
        FloatBuffer floatBuffer = FloatBuffer.wrap(floats);
        DoubleBuffer doubleBuffer = DoubleBuffer.wrap(doubles);
        ShortBuffer shortBuffer = ShortBuffer.wrap(shorts);
        LongBuffer longBuffer = LongBuffer.wrap(longs);

        System.out.println("byteBuffer=" + byteBuffer.getClass().getName());
        System.out.println("charBuffer=" + charBuffer.getClass().getName());
        System.out.println("intBuffer=" + intBuffer.getClass().getName());
        System.out.println("floatBuffer=" + floatBuffer.getClass().getName());
        System.out.println("doubleBuffer=" + doubleBuffer.getClass().getName());
        System.out.println("shortBuffer=" + shortBuffer.getClass().getName());
        System.out.println("longBuffer=" + longBuffer.getClass().getName());
    }
}
