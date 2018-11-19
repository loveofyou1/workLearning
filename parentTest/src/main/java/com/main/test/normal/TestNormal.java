package com.main.test.normal;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

/*        Date date1 = new Date();
        long time = 6 * 24 * 3600 * 1000;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        simpleDateFormat.format(date1);
        Date date2 = new Date(1527933719457L);
        Date date3 = new Date(date2.getTime() - time);
        long date1Time = date1.getTime();
        long date2Time = date2.getTime();
        long duetime = date2Time - date1Time;
        System.out.println(date2);
        System.out.println(date3);*/

        //测试多层循环
        //System.out.println(checkMap());
        //Long数据比较
        Long long1 = 1L;
        Long long2 = 2L;
        System.out.println(long1.equals(long2));

        BigDecimal negative = new BigDecimal(-1);
        BigDecimal mul = new BigDecimal(1000000);
        System.out.println(negative.multiply(mul));
    }


    private static boolean checkMap() {

        boolean isCheck = false;
        Map<String, List<String>> map = new HashMap<>();
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        map.put("1", list);

        List<String> list1 = new ArrayList<>();
        list1.add("c");
        list1.add("d");
        map.put("2", list1);

        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            for (String str : entry.getValue()) {
                if (entry.getKey().equals("1")) {
                    break;
                }
                System.out.println("first");
            }
        }
        System.out.println("last");
        return isCheck;
    }
}
