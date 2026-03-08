package com.javaproject;

import java.io.File;
import java.io.IOException;

public class Test06 {
    public static void main(String[] args) throws IOException {
        /*
        需求:
            在当前模块下的aaa文件夹中创建一个a.txt文件
         */
        File file = new File("day19\\aaa");
        System.out.println(file.mkdir());
        File file1 = new File(file, "a.txt");
        System.out.println(file1.createNewFile());

        System.out.println("=======================================");

        /*
        需求:
        定义一个方法找某一个文件夹中，是否有以avi结尾的电影。
        (暂时不需要考虑子文件夹)
         */
        File file2 = new File("D:\\Java\\abc");
        File[] files = file2.listFiles();
        for (File f : files) {
            if (f.isFile() && f.getName().endsWith("avi")){
                System.out.println(f.getName());
            }
        }

        System.out.println("=======================================");
    }
}
