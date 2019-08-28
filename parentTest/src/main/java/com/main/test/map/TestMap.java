package com.main.test.map;

import com.alibaba.fastjson.JSON;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author sunlei19
 * @create 2018/10/22
 */
public class TestMap {
    public static void main(String[] args) {
        Map<String, String> map = new LinkedHashMap<>();
        map.put("1", "1");
        map.put("3", "3");
        map.put("2", "2");
/*

        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

        System.out.println(Runtime.getRuntime().availableProcessors());
*/

      /*  Map<String, Object> resultMap = new HashMap<>();
        resultMap.put("test1", "1");
        resultMap.put("test",map);

        String json = JSON.toJSONString(resultMap);
        System.out.println(json);

        Map<String, Object> test = JSON.parseObject(json, Map.class);
        System.out.println(test);*/

        String uaLanguage = substringBetween("Language/en_US ","Language/"," ");
        System.out.println(uaLanguage);
        String hello = "Language/en_US";
        int start = hello.indexOf("Language/");
        int end = start + "Language/".length() + 5;
        System.out.println(hello.substring(start + "Language/".length(),end));
        System.out.println(subLanguageStr(hello));
        String stock = "stock_1";
        System.out.println(stock.substring(0,6));
    }


    public static String substringBetween(String str, String open, String close) {
        if (str != null && open != null && close != null) {
            int start = str.indexOf(open);
            if (start != -1) {
                int end = str.indexOf(close, start + open.length());
                if (end != -1) {
                    return str.substring(start + open.length(), end);
                }
            }

            return null;
        } else {
            return null;
        }
    }


    private static String subLanguageStr(String userAgent) {
        String uaLanguage;
        String lang = "Language/";
        int start = userAgent.indexOf(lang) + lang.length();
        int end = start + 5;
        uaLanguage = userAgent.substring(start, end);
        return uaLanguage;
    }
}
