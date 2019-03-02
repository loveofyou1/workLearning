package com.main.learn.designModel.createDesignModel.prototype;

/**
 * @author sunlei19
 * @create 2019/3/1
 */
public class ThingTest {
    public static void main(String[] args) {
        Thing thing = new Thing();
        /**
         * 对象拷贝时构造函数没有被执行，原理来讲是可以讲的通。
         * Object类的clone方法的原理是从内存中（堆内存）以二进制的方式进行拷贝，重新分配一个内存，那构造函数没有被执行也是正常的。
         */
        Thing cloneThing = thing.clone();
        System.out.println(cloneThing.equals(thing));
        System.out.println(cloneThing.getClass() == thing.getClass());
        System.out.println(cloneThing);
        System.out.println(thing);
        System.out.println(System.identityHashCode(cloneThing));
        System.out.println(System.identityHashCode(thing));
    }
}
