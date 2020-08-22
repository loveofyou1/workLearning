package com.main.test.normal.date;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

/**
 * @Description TestTimeOrder
 * @Author sunlei19
 * @Date 2020/6/11 18:24
 * @Version 1.0
 */
public class TestTimeOrder {
    public static void main(String[] args) {

        List<Date> dateList = new ArrayList<>();
        Date date1 = new Date(120, 12, 1, 1, 2, 3);
        Date date2 = new Date(120, 12, 1, 1, 2, 5);
        Date date3 = new Date(120, 12, 1, 1, 2, 4);
        dateList.add(date1);
        dateList.add(date2);
        dateList.add(date3);

        dateList.sort(Comparator.comparing(Date::getTime).reversed());
        for (Date date : dateList) {
            System.out.println(date.getTime());
        }
    }
}
