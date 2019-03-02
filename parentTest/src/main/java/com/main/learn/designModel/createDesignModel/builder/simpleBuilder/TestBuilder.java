package com.main.learn.designModel.createDesignModel.builder.simpleBuilder;

import com.alibaba.fastjson.JSON;

/**
 * 简化版的构建模式，省略了导演角色
 *
 * @author sunlei19
 * @create 2019/2/28
 */
public class TestBuilder {
    public static void main(String[] args) {

        User user = new User.UserBuilder("孙", "磊").age(30).phone("123").address("北京").build();
        System.out.println(JSON.toJSONString(user));
    }
}
