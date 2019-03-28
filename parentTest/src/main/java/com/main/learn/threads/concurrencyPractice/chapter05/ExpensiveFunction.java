package com.main.learn.threads.concurrencyPractice.chapter05;

import java.math.BigInteger;

/**
 * @author sunlei19
 * @create 2019/3/28
 */
public class ExpensiveFunction implements Computable<String, BigInteger> {

    @Override
    public BigInteger compute(String arg) throws InterruptedException {
        //经过长时间计算
        return new BigInteger(arg);
    }
}
