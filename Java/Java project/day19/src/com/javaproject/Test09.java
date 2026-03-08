package com.javaproject;

import java.io.File;

public class Test09 {
    public static void main(String[] args) {
        /*
        需求:
            统计一个文件夹的总大小
         */
        File file = new File("D:\\Java\\abc");
        long size = getFileSize(file);
        System.out.println(size);
    }

    public static long getFileSize(File file) {
        long size = 0;
        File[] files = file.listFiles();
        for (File src : files) {
            if (src.isFile()) {
                long length = src.length();
                size = size + length;
            } else {
                size = size + getFileSize(src);
            }
        }

        return size;
    }
}
