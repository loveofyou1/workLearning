package com.main.learn.effective.four;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sunlei19
 * @Description
 * @Date 2019/11/10 23:24
 */
public class TwentyOne {


    public static void main(String[] args) {
        List<Object> list = new ArrayList<>(10);
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");

        TestList testList = new TestList(list);

        testList.removeIf(o -> o.equals("1"));
        System.out.println(JSON.toJSONString(testList));
    }
}
