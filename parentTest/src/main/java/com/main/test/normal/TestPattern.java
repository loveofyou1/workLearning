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
        String saleName = "你好!@~#$%^&*()_+-=1234567890abcdefdsfklauopwqwerttyyuuioioplkjhgfdsazxcvbnbn,m<>?||;\\/\\'\"\\（\\)1000\u200B ml";
        String regex = "[^A-Za-z0-9\\+_\\-:\\u0E00-\\u0E7F\\u3000|\\u0020|\\u00A0\\u200B\\.\\(\\)\\（\\）\\<\\>\\?\\@\\#\\$\\%\\&\\*\\=\\+\\~\\;\\,\\!\\^\\'\\“\\”\\/\\\\]+";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(saleName);
        StringBuilder illegal = new StringBuilder();
        while (m.find()) {
            illegal.append(m.group()).append(" ");
            System.out.println(m.group()+"a");
        }
        System.out.println(illegal);
    }
}
