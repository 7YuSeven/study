package com.javaproject;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class Test13 {
    public static void main(String[] args) throws IOException {
        //Commonsio工具包
        //拷贝文件
        File f1 = new File("day21\\a.txt");
        File f2 = new File("day21\\new.txt");
//        FileUtils.copyFile(f1, f2);

        //拷贝文件夹
//        File f3 = new File("D:\\Java\\abc");
//        File f4 = new File("D:\\Java\\def");
//        FileUtils.copyDirectory(f3, f4);

//        File f3 = new File("D:\\Java\\abc");
//        File f4 = new File("D:\\Java\\def");
//        FileUtils.copyDirectoryToDirectory(f3, f4);

        //删除文件夹
        File f5 = new File("D:\\Java\\def");
//        FileUtils.deleteDirectory(f5);

        //清空文件夹
//        FileUtils.cleanDirectory(f5);

        //读取文件中的数据变成字符串
        String s = FileUtils.readFileToString(f1, "utf-8");
        System.out.println(s);
    }
}
