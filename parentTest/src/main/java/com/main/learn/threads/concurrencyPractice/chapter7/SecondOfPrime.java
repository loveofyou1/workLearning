package com.main.learn.threads.concurrencyPractice.chapter7;

import java.math.BigInteger;
import java.util.List;

import static java.util.concurrent.TimeUnit.SECONDS;

/**
 * @author sunlei19
 * @create 2018-03-19 10:54
 */
public class SecondOfPrime {

    public static List<BigInteger> aSecondeOfPrime() throws InterruptedException {
        PrimeGenrator genrator = new PrimeGenrator();
        new Thread(genrator).start();
        try {
            SECONDS.sleep(1);
        } finally {
            genrator.cancel();
        }
        return genrator.get();
    }
}
