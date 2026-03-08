package com.javaproject;

import java.io.*;

public class Test06 {
    public static void main(String[] args) throws IOException {
        //利用字节流读取文件中的数据，每次读一整行，而且不能出现乱码
//        FileInputStream fis = new FileInputStream("day21\\b.txt");
//        InputStreamReader isr= new InputStreamReader(fis);
//        BufferedReader br = new BufferedReader(isr);
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("day21\\b.txt")));

        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }

        br.close();
    }
}
