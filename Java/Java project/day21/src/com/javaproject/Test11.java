package com.javaproject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Test11 {
    public static void main(String[] args) throws IOException {
        //压缩单个文件
        File src = new File("day21\\a.txt");
        File dest = new File("day21\\");

        toZip(src, dest);
    }

    public static void toZip(File src, File dest) throws IOException {
        ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(new File(dest, "a.zip")));
        ZipEntry ze = new ZipEntry(src.getName());
        zos.putNextEntry(ze);
        FileInputStream fis = new FileInputStream(src);
        int len;
        while ((len = fis.read()) != -1) {
            zos.write(len);
        }
        zos.closeEntry();
        fis.close();
    }
}
