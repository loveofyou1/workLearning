package com.main.test.normal;

import java.io.UnsupportedEncodingException;

/**
 * 在网上流传这样一个面试题：Java中一个中文char的字节数是？答案为不确定（2，3，4），跟编码有关。
 * 下面这段程序可以证明这个答案：
 *
 * @author sunlei19
 * @create 2018/7/24
 */
public class TestCharLengthByCode {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String cnStr = "你";
        System.out.println("length of two Chinese character: " + cnStr.getBytes("UTF-8").length);
        String enStr = "a";
        System.out.println("length of one English character:" + enStr.getBytes("UTF-8").length);


        String chnStr = "华";
        System.out.println("length of one Chinese character in gbk: " + chnStr.getBytes("GBK").length);
        System.out.println("length of one Chinese character in UTF-8: " + chnStr.getBytes("UTF-8").length);
        System.out.println("length of one Chinese character in Unicode: " + chnStr.getBytes("UNICODE").length);
    }
}
