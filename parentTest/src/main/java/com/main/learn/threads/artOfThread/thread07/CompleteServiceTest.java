package com.main.learn.threads.artOfThread.thread07;

import com.main.learn.threads.util.SleepUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CompleteServiceTest {

    private static final Executor executor = Executors.newFixedThreadPool(10);

    public static void main(String[] args) {
        ExecutorCompletionService executorCompletionService = new ExecutorCompletionService(executor);

        List<Integer> list = new ArrayList<>(10);
        for (int i = 10; i > 0; i--) {
            list.add(i);
        }

        try {
            int count = 10;
            for (Integer str : list) {
                int num = count;
                executorCompletionService.submit(() -> {
                    SleepUtil.sleep(num);
                    return str+num;
                });
                count--;
            }

            for (int i = 0; i < 10; i++) {
                Future future = executorCompletionService.take();
               // System.out.println(future.get());
            }

            Collections.sort(list, new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    if (o1 > o2) {
                        return -1;
                    } else if (o1 < o2) {
                        return 1;
                    }else {
                        return 0;
                    }
                }
            });
            System.out.println(list);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
