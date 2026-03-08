package com.javaproject;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test03 {
    public static void main(String[] args) {
        File file1 = new File("D:\\Java\\abc");
        File file2 = new File("D:\\Java\\abc\\a.txt");

        //判断此路径名表示的File是否为文件夹
        System.out.println(file1.isDirectory());
        System.out.println(file2.isDirectory());

        System.out.println("-------------------------");

        //判断此路径名是否为文件
        System.out.println(file1.isFile());
        System.out.println(file2.isFile());

        System.out.println("-------------------------");

        //判断此路径是否存在
        File file3 = new File("D:\\Java\\aaaaa");
        System.out.println(file1.exists());
        System.out.println(file3.exists());

        System.out.println("-------------------------");

        //获取文件大小
        long length = file2.length();
        long length1 = file1.length();

        System.out.println(length);
        System.out.println(length1);

        System.out.println("-------------------------");

        //返回文件的绝对路径
        String absolutePath = file2.getAbsolutePath();
        String absolutePath1 = file3.getAbsolutePath();
        System.out.println(absolutePath);
        System.out.println(absolutePath1);

        System.out.println("-------------------------");

        //返回定义文件时使用的路径名
        String path = file1.getPath();
        String path1 = file3.getPath();
        System.out.println(path1);
        System.out.println(path);

        System.out.println("-------------------------");

        //返回文件的名字，带后缀
        String name = file2.getName();
        String name1 = file1.getName();
        System.out.println(name);
        System.out.println(name1);

        System.out.println("-------------------------");

        //返回文件的最后修改时间
        long time = file1.lastModified();
        long time1 = file2.lastModified();
        System.out.println(time);
        System.out.println(time1);

        System.out.println("-------------------------");

        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date(time);
        String format = df.format(date);
        System.out.println(format);

    }
}
