package com.javaproject;

import java.io.FileInputStream;
import java.io.IOException;

public class Test02 {
    public static void main(String[] args) throws IOException {
        //字节输入流
        //读取文件中的数据
        FileInputStream fis = new FileInputStream("day20\\a.txt");
//        int i = fis.read();
//        System.out.println(i);
//        System.out.println((char)i);
//        fis.close();

        //循环读取
        int len;
        while ((len = fis.read()) != -1) {
            System.out.print((char) len);
        }

        fis.close();

    }
}
