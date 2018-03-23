package com.main.threads.concurrencyPractice.chapter10;

import javax.naming.InsufficientResourcesException;

/**
 *
 * @author sunlei19
 * @create 2018-03-23 10:16
 */
public class DynmicDeadLock {

    public void transferMoney(Account fromAccount, Account toAccount, Double amout) throws 
            InsufficientResourcesException {
        synchronized (fromAccount) {
            synchronized (toAccount) {
                if (fromAccount.getBalance().compareTo(amout) < 0) {
                    throw new InsufficientResourcesException();
                } else {
                    fromAccount.debit(amout);
                    toAccount.credit(amout);
                } 
            }
        }


    }

    private class Account {
        public Double getBalance() {
            return new Double(10);
        }

        public void debit(Double amout) {
        }

        public void credit(Double amout) {
        }
    }
}
