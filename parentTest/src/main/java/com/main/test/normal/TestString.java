package com.main.test.normal;

import com.alibaba.fastjson.JSON;
import com.google.common.collect.Sets;

import java.util.Set;

public class TestString {
    public static void main(String[] args) {
        String supportLanguage = "th_TH,en_US,zh_CN";
        //System.out.printf(substringBefore(supportLanguage,","));
  /*      StringBuffer errorMsg = new StringBuffer();
        String msg = JSON.toJSONString(null);
        errorMsg.append(msg);
        System.out.println(errorMsg.toString());

        Set<String> errorSet = Sets.newHashSet();
        errorSet.add(null);
        errorSet.add("1");

        if (!(errorSet == null || errorSet.isEmpty())) {
            System.out.println(JSON.toJSONString(errorSet));
        }*/
        String colorStr = "purple";
        String[] colors = colorStr.split(",");
        System.out.println(JSON.toJSONString(colors));
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
