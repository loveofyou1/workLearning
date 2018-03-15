package com.main.test.annotation.main;

import com.main.test.annotation.AuthorAnno;

public class AnnotationDemo {

    @AuthorAnno(name = "sun", website = "fang.com", reversion = 2)
    public static void main(String[] args) {
        System.out.println("i am a main method");
    }

    @SuppressWarnings({"unchecked", "deprecation"})
    @AuthorAnno(name = "yuanhh", website = "gityuan.com", reversion = 3)
    public void demo() {
        System.out.println("I am demo method");
    }
}
