package com.javaproject;

import cn.hutool.core.io.FileUtil;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Test14 {
    public static void main(String[] args) {
        //hutool工具包
        //根据参数创建一个file对象
        File file1 = FileUtil.file("day21\\a.txt");
        System.out.println(file1);

        //根据参数创建，无路径会自动创建
        File touch = FileUtil.touch(file1);
        System.out.println(touch);

        //把集合中的数据写到文件中，覆盖模式
        File file2 = FileUtil.file("D:\\Java\\temp.txt");
//        ArrayList<String> list = new ArrayList<>();
//        list.add("a");
//        list.add("b");
//        list.add("c");
//
//        File file = FileUtil.writeLines(list, file2, "UTF-8");
//        System.out.println(file);

        //把集合中的数据续写到文件中
//        FileUtil.appendLines(list, file, "UTF-8");

        //读取数据到文件中
        List<String> strings = FileUtil.readLines(file2, "UTF-8");
        System.out.println(strings);
        
        //按照utf-8的形式，读取数据
        List<String> strings1 = FileUtil.readUtf8Lines(file2);
        System.out.println(strings1);
    }
}
