package com.main.threads.thread06;

import java.util.concurrent.atomic.AtomicReference;

/**
 * @author sunlei19
 * @create 2018-02-06 15:52
 */
public class AtomicReferenceTest {


    public static AtomicReference<User> reference = new AtomicReference<>();

    public static void main(String[] args) {
        User user = new User("sun", 15);
        reference.set(user);
        User update = new User("SUN", 20);
        reference.compareAndSet(user, update);
        System.out.println(reference.get().getName());
        System.out.println(reference.get().getAge());
    }

    static private class User {

        private String name;
        private int age;

        public User(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }
}
