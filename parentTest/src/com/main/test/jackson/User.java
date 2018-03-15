package com.main.test.jackson;

/**
 * @author sunlei19
 * @create 2018-02-26 15:50
 */
public class User implements Cloneable {

    private int id;
    private String name;
    private String sex;
    private String work;
    private int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return this.getId() + "," + getName() + "," + getSex() + "," + getWork() + "," + getAge();
    }


    public User(int id, String name, String sex, String work, int age) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.work = work;
        this.age = age;
    }

    public User() {
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return (User) super.clone();
    }
}
