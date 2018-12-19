package com.main.test;

import com.main.impl.Child;
import com.main.service.ParentInterface;
import com.main.test.jackson.User;
import com.main.learn.threads.util.SleepUtil;

/**
 * @author sunlei19
 * @create 2018-03-07 14:09
 */
public class TestGetClass {
    public static void main(String[] args) {
        User user = new User();
        System.out.println(user.getClass().getGenericInterfaces().length);
        ParentInterface test = new Child();
        System.out.println(test.getClass().getSimpleName());

        //取得类的名字
        if ("Child".toLowerCase().equalsIgnoreCase(test.getClass().getSimpleName().toLowerCase())) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        System.out.println(test.getClass().getInterfaces().length);

        final long currentTime = System.currentTimeMillis();

        System.out.println(currentTime);
        SleepUtil.sleep(10);
        System.out.println(currentTime);
    }
}
