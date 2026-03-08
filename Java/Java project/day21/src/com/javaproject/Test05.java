package com.javaproject;

import java.io.*;
import java.nio.charset.Charset;

public class Test05 {
    public static void main(String[] args) throws IOException {
        //利用字节流读取文件中的数据，
        //每次读一整行，而且不能出现乱码
//        InputStreamReader isr = new InputStreamReader(new FileInputStream("day21\\gbkfile.txt"), "GBK");
//        int len;
//        while ((len = isr.read()) != -1){
//            System.out.print((char)len);
//        }
//
//        isr.close();

//        FileReader fr = new FileReader("day21\\gbkfile.txt", Charset.forName("GBK"));
//        int ch;
//        while ((ch = fr.read()) != -1) {
//            System.out.print((char) ch);
//        }
//
//        fr.close();


        //利用字节流写出文件中的数据，
//        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("day21\\\\c.txt"), "GBK");
//        osw.write("你好");
//        osw.close();

//        FileWriter fw = new FileWriter("day21\\c.txt", Charset.forName("GBK"));
//        fw.write("你好啊");
//        fw.close();

        //将本地文件中的GBK文件，转成UTF-8
        //JDK11以前的方案
//        InputStreamReader isr = new InputStreamReader(new FileInputStream("day21\\c.txt"), Charset.forName("GBK"));
//        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("day21\\out.txt"), Charset.forName("UTF-8"));
//        int len;
//        while ((len = isr.read()) != -1) {
//            osw.write(len);
//        }
//
//        osw.close();
//        isr.close();

        //替代方案
        FileReader fr = new FileReader("day21\\c.txt", Charset.forName("GBK"));
        FileWriter fw = new FileWriter("day21\\out.txt", Charset.forName("UTF-8"));

        int len;
        while ((len = fr.read()) != -1) {
            fw.write(len);
        }

        fw.close();
        fr.close();
    }
}
