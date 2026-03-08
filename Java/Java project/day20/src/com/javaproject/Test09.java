package com.javaproject;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test09 {
    public static void main(String[] args) throws IOException {
        /*
        为了保证文件的安全性，就需要对原始文件进行加密存储，再使用的时候再对其进行解密处理。
        加密原理:
        对原始文件中的每一个字节数据进行更改，然后将更改以后的数据存储到新的文件中。
        解密原理
        读取加密之后的文件，按照加密的规则反向操作，变成原始文件
         */
        //使用异或
        //10 ^ 100 ^ 100 = 10

        FileInputStream fis = new FileInputStream("day20\\picture.jpg");
        FileOutputStream fos = new FileOutputStream("day20\\picture1.jpg");

        int len;
        while ((len = fis.read()) != -1){
            fos.write(len ^ 2);
        }

        fis.close();
        fos.close();
    }
}
