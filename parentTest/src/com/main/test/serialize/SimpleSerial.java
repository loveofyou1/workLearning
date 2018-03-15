package com.main.test.serialize;

import java.io.*;

public class SimpleSerial {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File file = new File("person.out");

        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(file));
        Person person = new Person("John", 101, Gender.MALE);
        outputStream.writeObject(person);
        outputStream.close();

        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(file));
        Person obj = (Person) inputStream.readObject();
        inputStream.close();
        System.out.println(obj + obj.getSerilizeObject());
    }
}
