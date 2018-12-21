package com.main.learn.LeetCode;

/**
 * @author sunlei19
 * @create 2018/12/21
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println(reverse(-123));
    }

    public static int reverse(int x) {
        String str = String.valueOf(x);
        char[] chars = str.toCharArray();
        int len = chars.length;
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = len - 1; i >= 0; i--) {
            if (chars[i] == '-') {
                stringBuffer.insert(0, chars[i]);
            } else {
                stringBuffer.append(chars[i]);
            }
        }
        Long result = Long.valueOf(stringBuffer.toString());
        if (result > Math.pow(2, 31) - 1 || result < -Math.pow(2, 31)) {
            result = new Long(0);
        }
        return result.intValue();
    }
}
