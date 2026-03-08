package com.javaproject;

import java.io.FileOutputStream;
import java.io.IOException;

public class Test01 {
    public static void main(String[] args) throws IOException {
        //字节输出流
        //写一段文字到本地文件
        //FileOutputStream fos = new FileOutputStream("day20\\a.txt");
//        fos.write(97);
//        fos.close();

        //一次写一个字节数组数据
        byte[] bytes = {97,98,99,100,101};
//        fos.write(bytes);
//        fos.close();

        //一次写一个字节数据的部分数据
//        fos.write(bytes, 0, 2);
//        fos.close();

        //换行写
//        fos.write(bytes);
//
//        String str = "\r\n";
//        byte[] bytes1 = str.getBytes();
//        fos.write(bytes1);
//
//        fos.write(97);
//        fos.write(99);
//
//        fos.close();

        //续写
        FileOutputStream fos = new FileOutputStream("day20\\a.txt", true);
        fos.write(100);
        fos.write(103);
        fos.close();
    }
}
