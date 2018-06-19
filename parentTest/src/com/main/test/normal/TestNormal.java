package com.main.test.normal;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestNormal {
    public static void main(String[] args) {
      /*  Map<String, List<String>> map = new HashMap<>();
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        map.put("a", list);

        map.get("a").set(0, "3");

        System.out.println(map.get("a"));


        Integer test = 1;
        System.out.println(test);*/

        Date date1 = new Date();
        long time = 6 * 24 * 3600 * 1000;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        simpleDateFormat.format(date1);
        Date date2 = new Date(1527933719457L);
        Date date3 = new Date(date2.getTime() - time);
        long date1Time = date1.getTime();
        long date2Time = date2.getTime();
        long duetime = date2Time - date1Time;
        System.out.println(date2);
        System.out.println(date3);
    }
}
