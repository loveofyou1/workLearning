package com.main.test.guava;

import com.google.common.reflect.TypeToken;

/**
 * @author sunlei19
 * @create 2018/12/10
 */
public class TestTypeToken {
    public static void main(String[] args) {
        TypeToken<String> strToken = TypeToken.of(String.class);
        TypeToken<Integer> intToken = TypeToken.of(Integer.class);

        System.out.println(strToken.getComponentType());
        System.out.println(strToken.getRawType());
        System.out.println(strToken.getType());
        System.out.println(strToken.getTypes());

        System.out.println(intToken.getComponentType());
        System.out.println(intToken.getRawType());
        System.out.println(intToken.getType());
        System.out.println(intToken.getTypes());
    }
}
