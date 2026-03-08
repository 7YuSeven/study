package com.javaproject;

import java.io.FileReader;
import java.io.IOException;

public class Test06 {
    public static void main(String[] args) throws IOException {
        //字符输入流
        FileReader fr = new FileReader("day20\\b.txt");
//        int ch;
//        while ((ch = fr.read()) != -1) {
//            System.out.print((char) ch);
//        }
//        fr.close();

        //数组读取
        char[] chars = new char[2];
        int ch;
        while ((ch = fr.read(chars)) != -1) {
            System.out.print(new String((chars), 0, ch));
        }

        fr.close();
    }
}
