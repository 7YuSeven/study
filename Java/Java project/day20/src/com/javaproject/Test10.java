package com.javaproject;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Test10 {
    public static void main(String[] args) throws IOException {
        /*
        文本文件中有以下的数据:
        2-1-9-4-7-8
        将文件中的数据进行排序，变成以下的数据:
        1-2-4-7-8-9
         */

        //读取文件
        FileReader fr = new FileReader("day20\\d.txt");
        int len;
        //使用stringbuilder保存文件内容
        StringBuilder sb = new StringBuilder();
        //遍历
        while ((len = fr.read()) != -1) {
            sb.append((char)len);
        }
        fr.close();

        //将sb转换为字符串
        String str = sb.toString();
        //字符串分割
        String[] strs = str.split("-");
        //创建集合
        ArrayList<Integer> list = new ArrayList<>();
        //遍历保存
        for (String s : strs) {
            list.add(Integer.parseInt(s));
        }
        //排序
        Collections.sort(list);
        //将数据存入文件
        FileWriter fw = new FileWriter("day20\\d.txt");
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1) {
                fw.write(list.get(i) + "");
            } else {
                fw.write(list.get(i) + "-");
            }
        }

        fw.close();
    }
}
