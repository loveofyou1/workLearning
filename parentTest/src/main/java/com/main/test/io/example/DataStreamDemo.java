package com.main.test.io.example;

import java.io.*;

/**
 * @author sunlei19
 * @create 2018/7/24
 */
public class DataStreamDemo {
    public static void main(String[] args) {
        Member[] members = {new Member("Justin", 90),
                new Member("momor", 95),
                new Member("Bush", 88)};
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(args[0]));
            for (Member member : members) {
                //写入UTF字符串
                dataOutputStream.writeUTF(member.getName());
                //写入int数据
                dataOutputStream.writeInt(member.getAge());
            }
            //所有数据至目的地
            dataOutputStream.flush();
            //关闭流
            dataOutputStream.close();
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(args[0]));
            //读出数据并还原为对象
            for (int i = 0; i < dataInputStream.available(); i++) {

                //读出UTF字符串
                String name = dataInputStream.readUTF();
                //读出int数据
                int score = dataInputStream.readInt();
                members[i] = new Member(name, score);
            }
            //关闭流
            dataInputStream.close();
            //显示还原后的数据
            for (Member member : members) {
                System.out.printf("%s\t%d%n", member.getName(), member.getAge());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class Member {
    private String name;
    private int age;


    public Member() {
    }


    public Member(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public void setName(String name) {
        this.name = name;
    }


    public void setAge(int age) {
        this.age = age;
    }


    public String getName() {
        return name;
    }


    public int getAge() {
        return age;
    }
}