package com.javaproject;

import java.io.*;

public class Test09 {
    public static void main(String[] args) throws IOException {
        //字节打印流
        //默认自动刷新，自动换行
        PrintStream ps = new PrintStream(new FileOutputStream("day21\\e.txt"), true, "UTF-8");
        ps.println(97);
        ps.print(98);
        ps.println();
        ps.printf("你好啊，%s", "小明");
        ps.close();

        //字符打印流
        //需要手动让其自动刷新
        PrintWriter pw = new PrintWriter(new FileWriter("day21\\f.txt"), true);
        pw.println(97);
        pw.println("你好");
        pw.close();

    }
}
