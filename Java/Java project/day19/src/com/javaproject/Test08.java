package com.javaproject;

import java.io.File;

public class Test08 {
    public static void main(String[] args) {
        /*
        需求:
            删除一个多级文件夹
         */
        File file = new File("D:\\Java\\abc\\aa");
        deleteFile(file);
    }

    //删除多级文件
    public static void deleteFile(File file) {
        File[] files = file.listFiles();

        for (File src : files) {
            if (src.isFile()){
                src.delete();
            } else {
                deleteFile(src);
            }
        }

        file.delete();
    }
}
