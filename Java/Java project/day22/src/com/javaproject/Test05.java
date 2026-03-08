package com.javaproject;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Test05 {
    public static void main(String[] args) throws IOException {
        /*
        需求：
            一个文件里面存储了班级同学的姓名，每一个姓名占一行。
            要求通过程序实现随机点名器。
            第三次必定是张三同学
            运行效果：
            第一次运行程序：随机同学姓名1
            第二次运行程序：随机同学姓名2
            第三次运行程序：张三
         */

        ArrayList<String> nameList = new ArrayList<>();

        BufferedReader br = new BufferedReader(new FileReader("day22\\name.txt"));
        String line;
        while ((line = br.readLine()) != null) {
            nameList.add(line);
        }
        br.close();

        FileInputStream fis = new FileInputStream("day22\\count.txt");
        int count = fis.read() - '0';
        fis.close();

        if (count == 3) {
            System.out.println("张三");
            count = 1;
        } else {
            Collections.shuffle(nameList);
            System.out.println(nameList.get(0));
            count ++;
        }

        PrintWriter pw = new PrintWriter("day22\\count.txt");
        pw.println(count);
        pw.close();

    }
}
