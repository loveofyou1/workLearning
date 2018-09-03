package com.main.threads.concurrencyPractice.chapter10;

import java.util.Random;

/**
 * @author sunlei19
 * @create 2018-03-23 10:42
 */
public class DemonstrateDeadLock {
    private static final int NUM_THREADS = 20;
    private static final int NUM_ACCOUNT = 5;
    private static final int NUM_ITERATIONS = 1000000;

    public static void main(String[] args) {
        final Random rnd = new Random();
        final Account[] accounts = new Account[NUM_ACCOUNT];

        for (int i = 0; i < accounts.length; i++) {
            accounts[i] = new Account();
        }

        class TransferThread extends Thread {
            public void run() {
                for (int i = 0; i < NUM_ITERATIONS; i++) {
                    int fromAcount = rnd.nextInt(NUM_ACCOUNT);
                    int toAccount = rnd.nextInt(NUM_ACCOUNT);
                    Double amount = new Double(rnd.nextInt(1000));
                    transferMoney(accounts[fromAcount], accounts[toAccount], amount);
                }
            }
        }

        for (int i = 0; i < NUM_THREADS; i++) {
            new TransferThread().start();
        }
    }

    private static void transferMoney(Account account, Account account1, Double amount) {
    }

}
