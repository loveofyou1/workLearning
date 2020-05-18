package com.main.learn.algorithm.sort;

import java.util.Random;

public class BubbleTest {

    public static void main(String[] args) {
        int[] array = {3, 1, 7, 4, 8, 2, 9, 5, 6, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 25, 26, 24, 30, 29, 27, 28, 23, 22, 21, 20};
        int length = 10000;
        int[] randomArray = new int[length];
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            randomArray[i] = random.nextInt();
        }
        long oneTime = System.currentTimeMillis();
        //sort1(randomArray);
        System.out.println(System.currentTimeMillis() - oneTime);
        long twoTime = System.currentTimeMillis();
        sort2(randomArray);
        System.out.println(System.currentTimeMillis() - twoTime);
        //System.out.println(Arrays.toString(randomArray));
    }

    public static void sort1(int array[]) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                int temp = 0;
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void sort2(int array[]) {
        for (int i = 0; i < array.length; i++) {
            boolean isSorted = true;
            for (int j = 0; j < array.length - i - 1; j++) {
                int temp = 0;
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    // 因为有元素交换，不是有序的
                    isSorted = false;
                }
            }
            if (isSorted) {
                break;
            }
        }
    }

    public static void sort3(int array[]) {
        // 记录最后一次交换的位置
        int lastExchangeIndex = 0;
        // 无序数列的边界，每次比较只需要比到这里为止
        int sortBorder = array.length - 1;
        for (int i = 0; i < array.length; i++) {
            boolean isSorted = true;
            for (int j = 0; j < sortBorder; j++) {
                int temp = 0;
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    // 因为有元素交换，不是有序的
                    isSorted = false;
                    // 更新为最后一次交换元素的位置
                    lastExchangeIndex = j;
                }
            }
            sortBorder = lastExchangeIndex;
            if (isSorted) {
                break;
            }
        }
    }

    /**
     * 鸡尾酒排序
     * 思想：
     * 1、第一轮从正序逐个比较大小。
     * 2、第二轮倒序逐个向前比较大小。
     *
     * @param array
     */
    public static void sort4(int array[]) {
        // 无序数列的边界，每次比较只需要比到这里为止
        for (int i = 0; i < array.length / 2; i++) {
            boolean isSorted = true;
            for (int j = i; j > array.length / 2 - i - 1; j++) {
                int temp = 0;
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    // 因为有元素交换，不是有序的
                    isSorted = false;
                    // 更新为最后一次交换元素的位置
                }
            }
            if (isSorted) {
                break;
            }

            // 在偶数轮之前，将isSorted置为true
            isSorted = true;
            for (int j = array.length - i - 1; j > i; j--) {
                int temp = 0;
                if (array[j] < array[j - 1]) {
                    temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                    isSorted = false;
                }
            }
            if (isSorted) {
                break;
            }
        }
    }
}
