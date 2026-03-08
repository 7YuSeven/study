package com.javaproject;

import java.io.*;
import java.nio.Buffer;

public class Test01 {
    public static void main(String[] args) throws IOException {
        //字节缓冲流，一次读写一个字节
//        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("day21\\a.txt"));
//        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("day21\\copy.txt"));
//
//        int len;
//        while ((len = bis.read()) != -1){
//            bos.write(len);
//        }
//
//        bis.close();
//        bos.close();

        //字节缓冲流一次读写多个字节
//        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("day21\\a.txt"));
//        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("day21\\copy.txt"));
//
//        byte[] bytes = new byte[1024];
//        int length;
//        while ((length = bis.read(bytes)) != -1){
//            bos.write(bytes, 0, length);
//        }
//
//        bis.close();
//        bos.close();
        //字符缓冲流输入流
        BufferedReader br = new BufferedReader(new FileReader("day21\\\\a.txt"));

        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }

        br.close();

        //字符缓冲输出流
        BufferedWriter bw = new BufferedWriter(new FileWriter("day21\\\\b.txt"));
        bw.write("你好");
        bw.newLine();
        bw.write("你也好");
        bw.close();
    }
}
