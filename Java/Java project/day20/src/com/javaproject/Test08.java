package com.javaproject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test08 {
    public static void main(String[] args) throws IOException {
        //拷贝一个文件夹
        File source = new File("D:\\Java\\abc");
        File dest = new File("D:\\Java\\qwe");
        copyFile(source, dest);
    }

    public static void copyFile(File source, File dest) throws IOException {
        dest.mkdirs();

        File[] files = source.listFiles();
        for (File file : files) {
            if (file.isFile()){
                FileInputStream fis = new FileInputStream(file);
                FileOutputStream fos = new FileOutputStream(new File(dest, file.getName()));

                byte[] bytes = new byte[1024];
                int len;
                while ((len = fis.read(bytes)) != -1){
                    fos.write(bytes, 0, len);
                }

                fis.close();
                fos.close();
            } else {
                copyFile(file, new File(dest, file.getName()));
            }
        }
    }
}
