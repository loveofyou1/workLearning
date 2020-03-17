package com.main.learn.threads.exercise.core.four.ConditionTestMoreMethod;

import com.alibaba.fastjson.JSON;

import java.util.HashMap;
import java.util.Map;

/**
 * @author sunlei19
 * @date 2020/1/2
 */
public class TestConditionMoreMethod {
    public static void main(String[] args) {
        try {
/*            MyService myService = new MyService();
            ThreadA threadA = new ThreadA(myService);
            threadA.start();

            ThreadAA threadAA = new ThreadAA(myService);
            threadAA.start();

            Thread.sleep(1000);

            ThreadB threadB = new ThreadB(myService);
            threadB.start();

            ThreadBB threadBB = new ThreadBB(myService);
            threadBB.start();*/
            UpdateProductParam updateProductParam = new UpdateProductParam();
            Map<Long, Map<Integer, Integer>> stockNumMap = new HashMap<>();
            Map<Integer, Integer> stockWareMap = new HashMap<>(1);
            stockWareMap.put(0, 10);
            stockNumMap.put(123456L, stockWareMap);

            updateProductParam.setStockNumMap(stockNumMap);
            System.out.println(JSON.toJSONString(updateProductParam));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    static class UpdateProductParam {
        private Map<Long, Map<Integer, Integer>> stockNumMap;

        public Map<Long, Map<Integer, Integer>> getStockNumMap() {
            return stockNumMap;
        }

        public void setStockNumMap(Map<Long, Map<Integer, Integer>> stockNumMap) {
            this.stockNumMap = stockNumMap;
        }
    }
}
