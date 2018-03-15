package com.main.test.samllTest;

import com.main.test.jackson.User;

/**
 * @author sunlei19
 * @create 2018-03-08 9:29
 */
public class TestClone {
    public static void main(String[] args) throws CloneNotSupportedException {
        User user = new User();
        user.setId(1);
        user.setName("hello");
        user.setAge(20);
        user.setWork("job");
        user.setSex("femal");


        User user1 = new User(2, "sun", "man", "work", 20);
        User user2 = (User)user1.clone();

        System.out.println(user);
        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user1);
    }
}
