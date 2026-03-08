//package com.itheima.ui;
//
//import java.io.BufferedReader;
//import java.io.File;
//import java.io.FileReader;
//import java.io.IOException;
//import java.util.Arrays;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
//public class Test {
//    public static void main(String[] args) throws IOException {
//
//        initData();
//    }
//
//    static Object[][] tabledatas = new Object[5][5];
//
//    //初始化数据
//    public static void initData() throws IOException {
//        File file = new File("diary\\diarys");
//        File[] files = file.listFiles();
//        if (files.length == 0) {
//            tabledatas = null;
//        }
//        for (File f : files) {
//            BufferedReader br = new BufferedReader(new FileReader(f));
//            String title = br.readLine().split(": ")[1];
//            String content = "";
//            br.readLine();
//            String line;
//            while ((line = br.readLine()) != null) {
//                content = content + line;
//            }
//
//            System.out.println(title);
//            System.out.println(content);
//        }
//
//    }
//}
