package com.main.test.normal;

import com.sun.deploy.util.StringUtils;

import java.math.BigDecimal;
import java.math.BigInteger;

public class TestString {
    public static void main(String[] args) {
        String supportLanguage = "th_TH,en_US,zh_CN";
        //System.out.printf(substringBefore(supportLanguage,","));
  /*      StringBuffer errorMsg = new StringBuffer();
        String msg = JSON.toJSONString(null);
        errorMsg.append(msg);
        System.out.println(errorMsg.toString());

        Set<String> errorSet = Sets.newHashSet();
        errorSet.add(null);
        errorSet.add("1");

        if (!(errorSet == null || errorSet.isEmpty())) {
            System.out.println(JSON.toJSONString(errorSet));
        }*/
  /*      String colorStr = "purple";
        String[] colors = colorStr.split(",");
        System.out.println(JSON.toJSONString(colors));
*/
        BigDecimal bigDecimal = new BigDecimal("666770000.00");
        BigInteger bigInteger = bigDecimal.toBigInteger();
        //System.out.println(bigInteger.toString());

/*
        Set<Long> set = new HashSet<>();
        set.add(1L);
        set.add(2L);
        set.add(3L);
        System.out.printf(set.toString().replace("[", "(").replace("]", ")"));
*/

 /*       String hello = "\t5311107";
        //String replaceStr = hello.replace(" ", "");

        //System.out.println(replaceStr);
        try {
            BigDecimal bigDecimal1 = new BigDecimal(hello);
            java.lang.Integer.valueOf(hello);
            System.out.println(bigDecimal1);
        } catch (Exception e) {
            e.printStackTrace();
        }*/
/*        String category = "1";
        String[] arr = category.split("_");
        for (int i = 0; i < arr.length; i++) {
           // System.out.println(arr.length);
           // System.out.println(i + arr[i]);
        }

        String str = " 7083406 \n\t";
        str = str.replaceAll(" ","").replaceAll("\n","");
        System.out.println(str);*/
        String test ="";
        int count=0;
        do {
            test = "nihao";
            count++;
            System.out.println(count);
        }while (test != null && test.length() == 0 && count<3);
        System.out.println(test+":" +count);
    }


    public static String substringBefore(String str, String separator) {
        if (!isEmpty(str) && separator != null) {
            if (separator.isEmpty()) {
                return "";
            } else {
                int pos = str.indexOf(separator);
                return pos == -1 ? str : str.substring(0, pos);
            }
        } else {
            return str;
        }
    }


    public static boolean isEmpty(CharSequence cs) {
        return cs == null || cs.length() == 0;
    }

    public static boolean isNumeric(String str) {
        if (str == null) {
            return false;
        }
        int sz = str.length();
        for (int i = 0; i < sz; i++) {
            if (Character.isDigit(str.charAt(i)) == false) {
                return false;
            }
        }
        return true;
    }
}
