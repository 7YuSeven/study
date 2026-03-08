package com.javaproject;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

public class Test05 {
    public static void main(String[] args) {
        //获取当前路径下的所有内容
        File file = new File("D:\\Java\\abc");
        File[] files = file.listFiles();
        for (File file1 : files) {
            System.out.println(file1);
        }

        System.out.println("=========================");

        //列出可用的系统盘符
        File[] files1 = File.listRoots();
        for (File file1 : files1) {
            System.out.println(file1);
        }

        System.out.println("=========================");

        //获取当前该路径下所有内容，仅仅获取名字
        String[] list = file.list();
        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("=========================");

        //利用文件名过滤器获取当前该路径下所有内容
        String[] list1 = file.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith(".txt");
            }
        });

        for (String s : list1) {
            System.out.println(s);
        }

        System.out.println("=========================");

        //利用文件名过滤器获取当前该路径下所有内容
        File[] files2 = file.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith(".txt");
            }
        });

        for (File file2 : files2) {
            System.out.println(file2);
        }

        System.out.println("=========================");

        //利用文件名过滤器获取当前该路径下所有内容
        File[] files3 = file.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.getName().endsWith(".txt");
            }
        });

        for (File file3 : files3) {
            System.out.println(file3);
        }


    }
}
