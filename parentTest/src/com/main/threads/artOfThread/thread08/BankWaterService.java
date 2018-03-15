package com.main.threads.artOfThread.thread08;

import java.util.Map;
import java.util.concurrent.*;

/**
 * @author sunlei19
 * @create 2018-02-06 16:29
 */
public class BankWaterService implements Runnable {

    //创建4个屏障，所有线程都执行完在执行run方法
    CyclicBarrier cyclicBarrier = new CyclicBarrier(4, this);

    //假设有4个sheet，所以只启动4个线程
    private Executor executor = Executors.newFixedThreadPool(4);

    /**
     * 保存每个sheet银行流水计算出的结果
     */
    private ConcurrentHashMap<String, Integer> eachSheetCount = new ConcurrentHashMap<>();

    private void count() {
        for (int i = 0; i < 4; i++) {
            executor.execute(new Runnable() {
                @Override
                public void run() {
                    //计算当前sheet的银行流水数据，代码略
                    eachSheetCount.put(Thread.currentThread().getName(), 1);
                    //银行流水计算完成，插入一个屏障
                    try {
                        cyclicBarrier.await();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } catch (BrokenBarrierException e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }

    @Override
    public void run() {
        int intResult = 0;
        //汇总每个sheet的数据
        for (Map.Entry<String, Integer> entry : eachSheetCount.entrySet()) {
            intResult += entry.getValue();
        }
        eachSheetCount.put("result", intResult);
        System.out.println(intResult);
    }
}
