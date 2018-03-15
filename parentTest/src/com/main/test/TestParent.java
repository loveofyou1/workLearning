package com.main.test;

import com.main.impl.Child;
import com.main.service.ParentInterface;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TestParent {

    private static ParentInterface parentInterface;

    public static void main(String args[]) {
        parentInterface = new Child();
        parentInterface.sayHello();

        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        String str = null;
        for (String key : list) {
            str += key;
            str += ",";
        }
    }
}
