package com.javaproject;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test03 {
    public static void main(String[] args) throws IOException {
        //文件拷贝
        long start = System.currentTimeMillis();

        FileInputStream fis = new FileInputStream("day20\\picture.jpg");
        FileOutputStream fos = new FileOutputStream("day20\\picture1.jpg");

        int len;
        while ((len = fis.read()) != -1) {
            fos.write(len);
        }

        fis.close();
        fos.close();

        long end = System.currentTimeMillis();

        System.out.println(end - start);
    }
}
