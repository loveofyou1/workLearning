package com.main.learn.threads.concurrencyPractice.chapter10;

import javax.naming.InsufficientResourcesException;

/**
 * 使用System.identityHashCode方法生成固定的hashcode，按返回的hash值来规定执行顺序
 *
 * @author sunlei19
 * @create 2018-03-23 10:24
 */
public class ResolveDynmicDeadLock {

    private static final Object tieLock = new Object();

    public void transferMoney(final Account fromAcct, final Account toAcct, final Double amount) throws
            InsufficientResourcesException {
        class Helper {
            public void transfer() throws InsufficientResourcesException {
                if (fromAcct.getBalance().compareTo(amount) < 0) {
                    throw new InsufficientResourcesException();
                } else {
                    fromAcct.debit(amount);
                }
            }
        }

        int fromHash = System.identityHashCode(fromAcct);
        int toHash = System.identityHashCode(toAcct);

        if (fromHash < toHash) {
            synchronized (fromAcct) {
                synchronized (toAcct) {
                    new Helper().transfer();
                }
            }
        } else if (fromHash > toHash) {
            synchronized (toAcct) {
                synchronized (fromAcct) {
                    new Helper().transfer();
                }
            }
        } else {
            synchronized (tieLock) {
                synchronized (fromAcct) {
                    synchronized (toAcct) {
                        new Helper().transfer();
                    }
                }
            }
        }
    }
}
