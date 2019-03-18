package com.main.test.readCsv;

import java.io.*;

/**
 * @author sunlei19
 * @create 2019/3/15
 */
public class ReadCsv {
    private static final String FILE_NAME = "D:/testcsv.csv";

    public static void main(String[] args) {
        readFromCsv();
        writeCsv();
    }

    private static void readFromCsv() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(FILE_NAME));
            String oneLine = bufferedReader.readLine();
            System.out.println(oneLine);
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                String items[] = line.split(",");
                String last = items[items.length - 1];
                System.out.println(last);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private static void writeCsv() {
        try {
            File file = new File(FILE_NAME);

            BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));

            writer.write("nihao" + "," + "wohao" + "," + "tahao");
            writer.newLine();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
