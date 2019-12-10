package com.main.test.normal.weight;

import java.math.BigDecimal;

/**
 * @author sunlei19
 * @Description TODO
 * @Date 2019/10/18 15:14
 */
public class ComputeWeight {
    public static void main(String[] args) {
        long total = 103;
        long div = total % 100;
        System.out.println(div);
    }

    public static String computeVolumeType(BigDecimal weight, Integer length, Integer width, Integer height) {
        boolean isBigType = length >= 100 || width >= 100 || height >= 100 || (weight.compareTo(new BigDecimal("30000000")) >=0) || ((length + width + height) >= 180);
        String hello = "";
        if (isBigType) {
            //大件
           hello = "大件";
        } else {
            //中小件
            hello ="小件";
        }
        return hello;
    }

}
