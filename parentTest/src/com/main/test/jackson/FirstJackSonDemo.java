package com.main.test.jackson;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

/**
 *
 * @author sunlei19
 * @create 2018-02-26 15:50
 */
public class FirstJackSonDemo {
    public static void main(String[] args) throws IOException {

        User user = new User();
        user.setId(1);
        user.setName("sun");
        user.setSex("man");
        user.setAge(20);
        user.setWork("enginer");

        ObjectMapper objectMapper = new ObjectMapper();

        String json = objectMapper.writeValueAsString(user);
        System.out.println(json);

        objectMapper.readValue(json, User.class);
        System.out.println(user.toString());
    }
}
