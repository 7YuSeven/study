package com.javaproject;

import java.io.*;

public class Test02 {
    public static void main(String[] args) throws IOException {
        //四种拷贝方式，各自用时
        long start = System.currentTimeMillis();
        File file1 = new File("day21\\picture.jpg");
        File file2 = new File("day21\\picture2.jpg");

        //method1(file1, file2);      //13465
        //method2(file1, file2);        //12
        //method3(file1, file2);          //70
        method4(file1, file2);          //11

        long end = System.currentTimeMillis();

        System.out.println(end - start);

    }

    //字节输入输出流,一次读写一个字节
    public static void method1(File file1, File file2) throws IOException {
        FileInputStream fis = new FileInputStream(file1);
        FileOutputStream fos = new FileOutputStream(file2);

        int len;
        while ((len = fis.read()) != -1) {
            fos.write(len);
        }

        fis.close();
        fos.close();
    }

    //字节输入输出流,一次读写多个个字节
    public static void method2(File file1, File file2) throws IOException {
        FileInputStream fis = new FileInputStream(file1);
        FileOutputStream fos = new FileOutputStream(file2);

        int len;
        byte[] bytes = new byte[1024 * 6];
        while ((len = fis.read(bytes)) != -1) {
            fos.write(bytes, 0, len);
        }

        fis.close();
        fos.close();
    }

    //字节缓冲流，一次读写一个字节
    public static void method3(File file1, File file2) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file1));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(file2));

        int len;
        while ((len = bis.read()) != -1) {
            bos.write(len);
        }

        bis.close();
        bos.close();
    }

    //字节缓冲流，一次读写多个字节
    public static void method4(File file1, File file2) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file1));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(file2));
        int len;
        byte[] bytes = new byte[1024 * 6];
        while ((len = bis.read(bytes)) != -1) {
            bos.write(bytes, 0, len);
        }
        bis.close();
        bos.close();
    }
}
