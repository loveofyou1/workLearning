package com.main.test.annotation.main;

import com.main.test.annotation.AuthorAnno;

import java.lang.reflect.Method;

public class AnnotationParser {
    public static void main(String[] args) throws ClassNotFoundException {
        String clazz = "com.main.test.annotation.main.AnnotationDemo";
        Method[] demoMethods = AnnotationParser.class.getClassLoader().loadClass(clazz).getMethods();

        for (Method method : demoMethods) {
            if (method.isAnnotationPresent(AuthorAnno.class)) {
                AuthorAnno authorAnno = method.getAnnotation(AuthorAnno.class);
                System.out.println("method:" + method);
                System.out.println("name=" + authorAnno.name() + ", website=" + authorAnno.website() + ",reversion="
                        + authorAnno.reversion());
            }
        }
    }
}
