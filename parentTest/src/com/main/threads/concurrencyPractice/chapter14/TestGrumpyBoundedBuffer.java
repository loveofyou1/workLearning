package com.main.threads.concurrencyPractice.chapter13;

import static java.util.concurrent.TimeUnit.SECONDS;

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
