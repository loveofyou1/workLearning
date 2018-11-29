package com.main.lamda.chapter07;

import java.util.function.Function;
import java.util.stream.Stream;

/**
 * @author sunlei19
 * @create 2018/11/26
 */
public class TestParall {
    public static void main(String[] args) {
        addTest();
        System.out.println(Runtime.getRuntime().availableProcessors());

        System.out.println("Sequential sum done in:" + measureSumperf(ParallelStreams::parallelSum, 100));
    }

    private static void addTest() {
        Long start = System.currentTimeMillis();
        System.out.println(Stream.iterate(1L, i -> i + 1).limit(100000000).reduce(0L, Long::sum));
        Long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    private static long measureSumperf(Function<Long, Long> adder, long n) {
        long fastest = Long.MAX_VALUE;
        for (int i = 0; i < 10; i++) {
            long start = System.nanoTime();
            long sum = adder.apply(n);
            long duration = (System.nanoTime() - start) / 100000;
            System.out.println("Result:" + sum);
            if (duration < fastest) {
                fastest = duration;
            }
        }
        return fastest;
    }
}

class ParallelStreams {
    private static Long sum = 0L;

    public static Long parallelSum() {
        return 1L;
    }

    public static Long parallelSum(Long aLong) {
        return sum + aLong;
    }
}