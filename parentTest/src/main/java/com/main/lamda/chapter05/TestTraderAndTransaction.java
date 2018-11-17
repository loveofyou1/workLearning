package com.main.lamda.chapter05;

import com.alibaba.fastjson.JSON;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TestTraderAndTransaction {
    private static Trader trader1 = new Trader("test1", "city1");
    private static Trader trader2 = new Trader("test2", "city2");
    private static Trader trader3 = new Trader("test3", "city3");
    private static Trader trader4 = new Trader("test4", "city4");

    private static List<Transaction> transactions = Arrays.asList(
            new Transaction(trader1, 2011, 300),
            new Transaction(trader1, 2012, 11),
            new Transaction(trader2, 2013, 12),
            new Transaction(trader2, 2014, 13),
            new Transaction(trader3, 2015, 14),
            new Transaction(trader4, 2016, 15)
    );

    public static void main(String[] args) {
        //查找2011年的所有交易并按交易额排序（从低到高）
        List<Transaction> tr2011 = transactions.stream().filter(year -> year.getYear() == 2011).
                sorted(Comparator.comparing(transaction -> transaction.getValue())).collect(Collectors.toList());
        System.out.println(JSON.toJSONString(tr2011));

        //交易员都在哪个城市工作过
        List<String> citys = transactions.stream().map(transaction -> transaction.getTrader().getCity())
                .distinct().collect(Collectors.toList());
        System.out.println(JSON.toJSONString(citys));

        //查找来自city2的交易员并按姓名排序
        List<Trader> findTrader = transactions.stream().map(Transaction::getTrader).filter(trader -> "city2".equals(trader.getCity()))
                .distinct().sorted(Comparator.comparing(trader -> trader.getName())).collect(Collectors.toList());
        System.out.println(JSON.toJSONString(findTrader));

        //返回所有交易员的姓名字符串，按字母顺序排序
        List<String> traderNames = transactions.stream().map(transaction -> transaction.getTrader().getName())
                .distinct().sorted().collect(Collectors.toList());
        System.out.println(JSON.toJSONString(traderNames));

        String names = transactions.stream().map(transaction -> transaction.getTrader().getName())
                .distinct().sorted().reduce("", (a, b) -> a + b);
        System.out.println(JSON.toJSONString(names));

        //有没有交易员是city3工作的
        boolean city3 = transactions.stream().anyMatch(transaction -> "city3".equals(transaction.getTrader().getCity()));
        System.out.println(city3);

        //打印生活在city4的所有交易额
        transactions.stream().filter(transaction -> "city4".equals(transaction.getTrader().getCity()))
                .map(Transaction::getValue).forEach(System.out::println);

        //所有交易中最高的交易额
        Optional<Integer> maxValue = transactions.stream().map(Transaction::getValue).reduce(Integer::max);
        System.out.println(JSON.toJSONString(maxValue));

        //所有交易中最小的交易额
        Optional<Integer> minValue = transactions.stream().map(Transaction::getValue).reduce(Integer::min);
        System.out.println(JSON.toJSONString(minValue));
    }
}
