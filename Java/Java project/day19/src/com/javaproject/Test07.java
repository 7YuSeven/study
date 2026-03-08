package com.javaproject;

import java.io.File;

public class Test07 {
    public static void main(String[] args) {
        /*
        需求:
            找到电脑中所有以avi结尾的电影。
            (需要考虑子文件夹)
         */
        //getRoot();
        File file = new File("D:\\");
        getFile(file);
    }

    //获取电脑所有的盘
    public static void getRoot(){
        File[] files = File.listRoots();

        for (File file : files) {
            getFile(file);
        }
    }

    //获取以avi为后缀的所有文件
    public static void getFile(File file) {
        File[] files = file.listFiles();

        if (files != null) {
            for (File src : files) {
                if (src.isFile() && src.getName().endsWith(".avi")){
                    System.out.println(src.getName());
                }else {
                    getFile(src);
                }
            }
        }
    }
}
