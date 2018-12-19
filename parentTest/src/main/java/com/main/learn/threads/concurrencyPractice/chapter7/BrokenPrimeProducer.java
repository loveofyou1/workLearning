package com.main.learn.threads.concurrencyPractice.chapter7;

import java.math.BigInteger;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

/**
 * @author sunlei19
 * @create 2018-03-19 11:15
 */
public class BrokenPrimeProducer extends Thread {
    private final BlockingQueue<BigInteger> queue;
    private volatile boolean canceled = true;

    BrokenPrimeProducer(BlockingQueue<BigInteger> queue) {
        this.queue = queue;
    }

    public void run() {
        try {
            BigInteger p = BigInteger.ONE;
            while (!canceled) {
                queue.put(p = p.nextProbablePrime());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void cancel() {
        canceled = true;
    }

    void consumePrime() throws InterruptedException {
        BlockingQueue<BigInteger> primes = new BlockingQueue<BigInteger>() {
            @Override
            public boolean add(BigInteger integer) {
                return false;
            }

            @Override
            public boolean offer(BigInteger integer) {
                return false;
            }

            @Override
            public BigInteger remove() {
                return null;
            }

            @Override
            public BigInteger poll() {
                return null;
            }

            @Override
            public BigInteger element() {
                return null;
            }

            @Override
            public BigInteger peek() {
                return null;
            }

            @Override
            public void put(BigInteger integer) throws InterruptedException {

            }

            @Override
            public boolean offer(BigInteger integer, long timeout, TimeUnit unit) throws InterruptedException {
                return false;
            }

            @Override
            public BigInteger take() throws InterruptedException {
                return null;
            }

            @Override
            public BigInteger poll(long timeout, TimeUnit unit) throws InterruptedException {
                return null;
            }

            @Override
            public int remainingCapacity() {
                return 0;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends BigInteger> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public boolean equals(Object o) {
                return false;
            }

            @Override
            public int hashCode() {
                return 0;
            }

            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<BigInteger> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public int drainTo(Collection<? super BigInteger> c) {
                return 0;
            }

            @Override
            public int drainTo(Collection<? super BigInteger> c, int maxElements) {
                return 0;
            }
        };
        BrokenPrimeProducer producer = new BrokenPrimeProducer(primes);
        producer.start();
        try {
            while (needMorePrimes()) {
                consume(primes.take());
            }
        } finally {
            producer.cancel();
        }
    }

    private void consume(BigInteger take) {
    }

    private boolean needMorePrimes() {
        return true;
    }
}
