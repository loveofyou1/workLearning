package com.main.test.jackson;

import com.alibaba.fastjson.JSON;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

/**
 * @Description TestJsonParam
 * @Author sunlei19
 * @Date 2020/7/13 20:08
 * @Version 1.0
 */
public class TestJsonParam {

    private static String str = "{\"body\":{\"shareId\":\"\",\"activityId\":\"42\",\"taskId\":\"\"}}";

    public static final String DEFAULT_PATTERN = "yyyy-MM-dd HH:mm:ss";

    public static final String JACKSON_TIME_PATTERN = "yyyy-MM-dd'T'HH:mm:ss.SSSZ";

    public static void main(String[] args) {
        Map<String, Object> map = JSON.parseObject(str, Map.class);


        String date = "2020-07-13 16:40:19";

        System.out.println(getDateStr(date,DEFAULT_PATTERN,JACKSON_TIME_PATTERN));

    }


    public static String getDateStr(String dateStr, String dateFromat,
                                    String stringFormat) {
        SimpleDateFormat format = new SimpleDateFormat();

        try {
            format.applyPattern(dateFromat);
            Date date = format.parse(dateStr);
            format.applyPattern(stringFormat);
            return format.format(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return null;
    }
}
