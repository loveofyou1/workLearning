package com.main.learn.threads.artOfThread.thread07;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;

/**
 * @author Dean
 * @create 2018/9/11
 */
public class AtomicLongFieldUpdaterTest {
    private static AtomicLongFieldUpdater<User1> longFieldUpdater = AtomicLongFieldUpdater.newUpdater(User1.class, "userId");


    public static void main(String[] args) {
        User1 user1 = new User1();
        user1.setUserId(2);
        System.out.println(longFieldUpdater.incrementAndGet(user1));
    }


    static class User1 {
        public volatile long userId;


        @Override
        public String toString() {
            return "User1{" +
                    "userId=" + userId +
                    '}';
        }


        public long getUserId() {
            return userId;
        }


        public void setUserId(long userId) {
            this.userId = userId;
        }
    }
}
