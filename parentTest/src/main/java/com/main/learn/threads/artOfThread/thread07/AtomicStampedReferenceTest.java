package com.main.learn.threads.artOfThread.thread07;

import java.util.concurrent.atomic.AtomicStampedReference;

/**
 * AtomicStampedReference 更新对象
 *
 * @author Dean
 * @create 2018/9/11
 */
public class AtomicStampedReferenceTest {


    private static AtomicStampedReference<User2> stampedReference;


    public static void main(String[] args) {
        User2 user2 = new User2(10);
        stampedReference = new AtomicStampedReference<>(user2, 1);

        System.out.println(stampedReference.getReference().getId());
        System.out.println(stampedReference.getStamp());
        System.out.println(stampedReference.attemptStamp(user2, 2));
        System.out.println(stampedReference.compareAndSet(user2, new User2(1), 2, 3));
        System.out.println(stampedReference.getStamp());
        System.out.println(stampedReference.getReference().getId());
    }


    static class User2 {

        public User2(int id) {
            this.id = id;
        }


        public volatile int id;


        public int getId() {
            return id;
        }


        public void setId(int id) {
            this.id = id;
        }
    }
}
