package com.main.test.normal;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Description TestPattern
 * @Author sunlei19
 * @Date 2020/5/19 19:40
 * @Version 1.0
 */
public class TestPattern {
    public static void main(String[] args) {
        String saleName = "你好!@~#$%^&*()_+-=　1  234567890abcdefdsfklauopwqwerttyyuuioioplkjhgfdsazxcvbnbn,m<>?||;\\/\\'\"\\（\\）{}ชมพู[ราสเบอรร์รี่]";
        String regex = "[^A-Za-z0-9\\+_\\-:\\u0E00-\\u0E7F\\u0020\\u3000\\u0020|\\u00A0\\.\\(\\)\\（\\）\\[\\]\\{\\}\\<\\>\\?\\@\\#\\$\\%\\&\\*\\=\\+\\~\\;\\,\\!\\^\\'\\“\\”\\/\\\\]+";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(saleName);
        StringBuilder illegal = new StringBuilder();
        while (m.find()) {
            //illegal.append(m.group()).append("a");
            //  System.out.println(m.group() + "a");
        }


        //System.out.println(illegal);

        String num = "-1";
        if (isPositiveInteger(num)) {
            System.out.println(num);
        }
    }

    private static boolean isMatch(String regex, String orginal) {
        if (orginal == null || orginal.trim().equals("")) {
            return false;
        }
        Pattern pattern = Pattern.compile(regex);
        Matcher isNum = pattern.matcher(orginal);
        return isNum.matches();
    }

    public static boolean isPositiveInteger(String orginal) {
        return isMatch("^\\+{0,1}[1-9]\\d*", orginal);
    }
}
