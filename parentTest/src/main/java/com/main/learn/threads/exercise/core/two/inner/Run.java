package com.main.learn.threads.exercise.core.two.inner;

/**
 * @author sunlei19
 * @Description TODO
 * @Date 2019/12/30 14:17
 */
public class Run {
    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();
        publicClass.setUserName("userName");
        publicClass.setPassword("password");
        System.out.println("userName=" + publicClass.getUserName() + " password=" + publicClass.getPassword());

        PublicClass.PrivateClass privateClass = new PublicClass.PrivateClass();
        privateClass.setAge("10");
        privateClass.setAddress("beijing");
        System.out.println("age=" + privateClass.getAge() + " address=" + privateClass.getAddress());
    }
}
