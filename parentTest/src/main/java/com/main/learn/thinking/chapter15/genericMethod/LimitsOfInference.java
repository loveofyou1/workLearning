package com.main.learn.thinking.chapter15.genericMethod;

import com.alibaba.fastjson.JSON;
import com.main.test.jackson.User;
import com.main.test.serialize.first.Person;

import java.util.List;
import java.util.Map;

/**
 * @author sunlei19
 * @create 2019/4/28
 */
public class LimitsOfInference {
    static void f(Map<Person, List<? extends User>> petPeople) {
        System.out.println(JSON.toJSONString(petPeople));
    }

    public static void main(String[] args) {
        f(New.map());
    }
}
