package com.javaproject;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeMap;
import java.util.function.BiConsumer;

public class Test03 {
    public static void main(String[] args) throws IOException {
        //需求:把《出师表》的文章顺序进行恢复到一个新文件中，
        BufferedReader br = new BufferedReader(new FileReader("day21\\csb.txt"));
        String line;
        TreeMap<Integer, String> tm = new TreeMap<>();
        while ((line = br.readLine()) != null) {
            tm.put(Integer.parseInt((line.split("\\.")[0])), line.split("\\.")[1]);
        }
        br.close();

        BufferedWriter bw = new BufferedWriter(new FileWriter("day21\\csb2.txt"));

        tm.forEach(new BiConsumer<Integer, String>() {
            @Override
            public void accept(Integer integer, String s) {
                try {
                    bw.write(integer + "." + s);
                    bw.newLine();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        bw.close();

//        Collections.sort(list, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                int num1 = Integer.parseInt(o1.split("\\.")[0]);
//                int num2 = Integer.parseInt(o2.split("\\.")[0]);
//
//                return num1 - num2;
//            }
//        });
//
//        BufferedWriter bw = new BufferedWriter(new FileWriter("day21\\csb2.txt"));
//        for (String s : list) {
//            bw.write(s);
//            bw.newLine();
//        }
//        bw.close();



    }
}
