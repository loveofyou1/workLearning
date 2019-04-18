package com.main.test.map;

import java.util.HashMap;
import java.util.Map;

/**
 * 重写equals方法和hashcode方法
 * 1.没有重写hashCode，hashMap判断的父类Object对象的hashCode值，两个对象肯定不同。
 * 2.没有重写equals，hashMap根据父类的Object对象equals方法判断，比较的是两个对象的地址，所以不可以。
 *
 * @author sunlei19
 * @create 2019/4/18
 */
public class TestHashCode {
    public static void main(String[] args) {

        Key key1 = new Key(1);
        Key key2 = new Key(1);
        Map<Key, String> hashMap = new HashMap(2);
        hashMap.put(key1, "this ids is 1");
        System.out.println(hashMap.get(key2));
    }
}

class Key {
    private Integer id;

    public Key(int i) {
        this.id = i;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || !(o instanceof Key)) {
            return false;
        } else {
            return this.getId().equals(((Key) o).getId());
        }
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
