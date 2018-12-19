package com.main.learn.threads.concurrencyPractice.chapter7;

import java.math.BigInteger;
import java.util.List;

/**
 * @author sunlei19
 * @create 2018-03-19 10:51
 */
public class TestPrimeGenerator {
    public static void main(String[] args) throws InterruptedException {
        List<BigInteger> primeList = SecondOfPrime.aSecondeOfPrime();
        StringBuilder primeStr = new StringBuilder();
        if (primeList != null && primeList.size() > 0) {
            int count = 0;
            for (BigInteger prime : primeList) {
                primeStr.append(prime).append(",");
                count++;
                if (count % 10 == 0) {
                    primeStr.append("\n");
                    count = 0;
                }
            }
        }
        System.out.println(primeStr);
    }


}
