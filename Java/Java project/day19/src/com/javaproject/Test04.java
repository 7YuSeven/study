package com.javaproject;

import java.io.File;
import java.io.IOException;

public class Test04 {
    public static void main(String[] args) throws IOException {
        //创建一个新的空的文件
        File file = new File("D:\\Java\\abc\\b.txt");

        boolean b = file.createNewFile();
        System.out.println(b);

        System.out.println("===============================");

        //创建单级文件夹
        File file1 = new File("D:\\Java\\abc\\bb");
        boolean b1 = file1.mkdir();
        System.out.println(b1);

        System.out.println("===============================");

        //创建多级文件夹
        File file2 = new File("D:\\Java\\abc\\bb\\aa");
        boolean b2 = file2.mkdirs();
        System.out.println(b2);

        System.out.println("===============================");

        //删除文件、空文件夹
        File file3 = new File("D:\\Java\\abc");
        boolean b3 = file2.delete();
        System.out.println(b3);
        boolean b4 = file1.delete();
        System.out.println(b4);
        boolean b5 = file3.delete();
        System.out.println(b5);
    }
}
