package com.main.learn.threads.concurrencyPractice.chapter14;

public class TestGrumpyBoundedBuffer {
    GrumpyBoundedBuffer buffer = new GrumpyBoundedBuffer(10);

    public static void main(String[] args) {

    }

    void test() throws InterruptedException {
        while (true) {
            V item = (V) buffer.doTake();
            break;
        }
    }
}

class V {

}
