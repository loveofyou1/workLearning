package com.main.threads.artOfThread.thread01;

public class Main {
    public static void main(String[] args) {
        int i = 10;
        for (int j = 0; j < i; j++) {
            MyThread thread = new MyThread("hello");
            thread.start();
        }
    }
}
