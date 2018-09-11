package com.main.threads.artOfThread.thread07;


import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/**
 * @author Dean
 * @create 2018/9/11
 */
public class AtomicIntegerFieldUpdaterTest {
    //创建原子更新器，并设置需要更新的对象类和对象的属性
    private static AtomicIntegerFieldUpdater<User> updater = AtomicIntegerFieldUpdater.newUpdater(User.class, "age");


    public static void main(String[] args) {
        User user = new User();
        user.setId(1);
        user.setName("dean");
        user.setSex("male");
        user.setWork("tech Programer");
        user.setAge(20);

        System.out.println(updater.incrementAndGet(user));
    }


    static class User {
        private int id;
        private String name;
        private String sex;
        private String work;
        public volatile int age;


        public int getId() {
            return id;
        }


        public void setId(int id) {
            this.id = id;
        }


        public String getName() {
            return name;
        }


        public void setName(String name) {
            this.name = name;
        }


        public String getSex() {
            return sex;
        }


        public void setSex(String sex) {
            this.sex = sex;
        }


        public String getWork() {
            return work;
        }


        public void setWork(String work) {
            this.work = work;
        }


        public int getAge() {
            return age;
        }


        public void setAge(int age) {
            this.age = age;
        }

    }
}
