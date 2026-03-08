package com.javaproject;

import java.io.FileWriter;
import java.io.IOException;

public class Test07 {
    public static void main(String[] args) throws IOException {
        //字符输出流
        FileWriter fw = new FileWriter("day20\\c.txt");
        //续写
        //FileWriter fw = new FileWriter("day20\\c.txt", true);
        //写一个字符
        fw.write(97);
        fw.write("\r\n");
        //写一个字符串
        fw.write("hello");
        fw.write("\r\n");
        //写一个字符串的一部分
        fw.write("world", 0, 2);
        fw.write("\r\n");
        //写一个字符数组
        char[] chars = {97,'b','我','你'};
        fw.write(chars);
        fw.write("\r\n");
        //写一个字符数组的一部分
        char[] chars2 = {105,106,107,108};
        fw.write(chars2, 0, 2);

        fw.close();
    }
}
