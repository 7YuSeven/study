package com.javaproject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class Test10 {
    public static void main(String[] args) throws IOException {
        //解压缩流
        File src = new File("D:\\Java\\abc.zip");
        File dest = new File("D:\\Java");

        //解压
        upZip(src, dest);
    }

    public static void upZip(File src, File dest) throws IOException {
        //创建一个解压缩流对象
        ZipInputStream zis = new ZipInputStream(new FileInputStream(src));
        //获取压缩包中每一个文件的对象
        ZipEntry entry;
        //循环遍历压缩包中的每个文件
        while ((entry = zis.getNextEntry()) != null) {
            //判断是否为文件夹
            if (entry.isDirectory()) {
                //获取路径，创建文件夹
                File file = new File(dest, entry.toString());
                file.mkdirs();
            } else {
                //文件则创建文件并拷贝
                File file = new File(dest, entry.toString());
                FileOutputStream fos = new FileOutputStream(file);
                int len;
                while ((len = zis.read()) != -1) {
                    fos.write(len);
                }
                fos.close();
                zis.closeEntry();
            }
        }
        zis.close();
    }
}
