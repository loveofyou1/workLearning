package com.main.test.normal;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 反射
 */
public class TestReflect {
    public static void main(String[] args) {
        try {
            Class rel = Class.forName(ReflectMethods.class.getName());
            Method[] methods = rel.getDeclaredMethods();
            for (Method method : methods) {
                System.out.println(method.toString());
            }

            Field[] fields = rel.getFields();
            for (Field field : fields) {
                System.out.println(field.toString());
            }

            Constructor[] constructors = rel.getConstructors();
            for (Constructor constructor : constructors) {
                System.out.println(constructor.toString());
            }

            ReflectMethods constructor = (ReflectMethods) rel.newInstance();
            constructor.method1();
            constructor.method2();

            Constructor constructor1 = rel.getDeclaredConstructor(int.class);
            ReflectMethods reflectMethods = (ReflectMethods) constructor1.newInstance(1);
            System.out.println(reflectMethods.toString());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
