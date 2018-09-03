package com.main.test.annotation;


import java.lang.annotation.*;

@Documented
@Target({ElementType.TYPE, ElementType.METHOD})
@Inherited
@Retention(RetentionPolicy.RUNTIME)
public @interface AuthorAnno {

    String name();

    String website() default "sun.com";

    int reversion() default 1;
}
