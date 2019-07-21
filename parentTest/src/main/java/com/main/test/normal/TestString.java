package com.main.test.normal;

public class TestString {
    public static void main(String[] args) {
        String supportLanguage = "th_TH,en_US,zh_CN";
        System.out.printf(substringBefore(supportLanguage,","));
    }


    public static String substringBefore(String str, String separator) {
        if (!isEmpty(str) && separator != null) {
            if (separator.isEmpty()) {
                return "";
            } else {
                int pos = str.indexOf(separator);
                return pos == -1 ? str : str.substring(0, pos);
            }
        } else {
            return str;
        }
    }


    public static boolean isEmpty(CharSequence cs) {
        return cs == null || cs.length() == 0;
    }
}
