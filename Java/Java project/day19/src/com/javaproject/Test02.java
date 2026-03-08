package com.javaproject;

import java.io.File;

public class Test02 {
    public static void main(String[] args) {
        //根据文件路径创建文件对象
        String str = "D:\\Java\\abc";
        File file = new File(str);

        System.out.println(file);

        System.out.println("----------------");

        //根据父路径名字符串和子路径名字符串创建文件对象
        String parent1 = "D:\\Java";
        String child1 = "abc";
        File file1 = new File(parent1, child1);
        System.out.println(file1);
        System.out.println("---------------");

        //根据父路径对应的文件对象和子路径名字符串创建文件对象
        File parent2 = new File("D:\\Java");
        String child2 = "abc";
        File file2 = new File(parent2, child2);
        System.out.println(file2);

    }
}
