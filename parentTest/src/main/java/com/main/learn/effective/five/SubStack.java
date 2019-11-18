package com.main.learn.effective.five;

import java.util.Collection;
import java.util.List;
import java.util.Stack;

/**
 * @author sunlei19
 * @Description PECS规则，producer-extends customer-super
 * @Date 2019/11/13 08:06
 */
public class SubStack<E> extends Stack<E> {
    /**
     * 生产者使用extends
     *
     * @param src
     */
    public void pushAll(Iterable<? extends E> src) {
        for (E e : src) {
            push(e);
        }
    }

    /**
     * 消费者使用super
     *
     * @param dst
     */
    public void popAll(Collection<? super E> dst) {
        while (!isEmpty()) {
            dst.add(pop());
        }
    }

    /**
     * Comparable和Comparator都使用super，比较器都是消费者
     *
     * @param list
     * @param <T>
     * @return
     */
    public static <T extends Comparable<? super T>> T max(List<? extends T> list) {
        return (T) list;
    }
}
