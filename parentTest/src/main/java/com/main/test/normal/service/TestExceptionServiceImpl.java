package com.main.test.normal.service;

/**
 * @author sunlei19
 * @create 2018/11/19
 */
public class TestExceptionServiceImpl implements TestExceptionService {
    @Override
    public String test(String str) {
        Integer result = Integer.parseInt(str == null ? "1" : str);
        return String.valueOf(result);
    }
}
