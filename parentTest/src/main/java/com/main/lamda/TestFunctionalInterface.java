package com.main.lamda;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author sunlei19
 * @create 2018/11/12
 */
public class TestFunctionalInterface {
    public static void main(String[] args) throws IOException {
        //test();
        String readLine = processFile((BufferedReader br) -> br.readLine());
        System.out.println(readLine);
    }


    private static void test() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("D:/a.txt"));
            System.out.println(bufferedReader.readLine());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private static String processFile(BufferedReaderProcessor bufferedReaderProcessor) throws IOException {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("D:/a.txt"))) {
            return bufferedReaderProcessor.process(bufferedReader);
        }
    }


}
