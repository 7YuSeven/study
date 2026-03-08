package com.javaproject;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Test12 {
    public static void main(String[] args) throws IOException {
        //压缩文件夹和文件
        File src = new File("D:\\Java\\abc");
        File dest = new File(src.getParent(), src.getName() + ".zip");
        //创建压缩流对象
        ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(dest));

        toZip(src, zos, src.getName());

        zos.close();
    }

    public static void toZip(File src, ZipOutputStream zos, String name) throws IOException {
        File[] files = src.listFiles();
        //遍历
        for (File file : files) {
            //判断是否为文件
            if (file.isFile()){
                //获取单个文件的ZipEntry对象，放入压缩包中
                ZipEntry ze = new ZipEntry(name + "\\" + file.getName());
                zos.putNextEntry(ze);
                FileInputStream fis = new FileInputStream(file);
                int len;
                while ((len = fis.read()) != -1) {
                    zos.write(len);
                }
                zos.closeEntry();
                fis.close();
            } else {
                toZip(file, zos, name + "\\" + file.getName());
            }
        }
    }
}
