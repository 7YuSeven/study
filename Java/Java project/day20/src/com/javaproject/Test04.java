package com.javaproject;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test04 {
    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();
        //文件拷贝改写
        FileInputStream fis = new FileInputStream("day20\\picture.jpg");
        FileOutputStream fos = new FileOutputStream("day20\\picture1.jpg");

        byte[] bytes = new byte[1024 * 5];

        int len;
        while ((len = fis.read(bytes)) != -1){
            fos.write(bytes, 0, len);
        }

        fos.close();
        fis.close();

        long end = System.currentTimeMillis();

        System.out.println(end - start);

    }
}
