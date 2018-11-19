package com.main.test.normal;

import com.main.test.normal.service.TestExceptionService;
import com.main.test.normal.service.TestExceptionServiceImpl;

/**
 * @author sunlei19
 * @create 2018/11/19
 */
public class TestNumberFormat {
    public static void main(String[] args) {
        try {
            String test = "null";
            //int current = Integer.parseInt(test == null ? "1" : test);
            TestExceptionService testExceptionService = new TestExceptionServiceImpl();
            String result = testExceptionService.test(test);
            System.out.println(result);
        } catch (Exception e) {
           e.printStackTrace();
        }
    }
}
