package com.javaproject;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test11 {
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

        //排序
        Integer[] array = Arrays.stream(sb.toString().split("-"))
                .map(Integer::parseInt)
                .sorted()
                .toArray(Integer[]::new);

        //将数据存入文件
        String str = Arrays.toString(array).replace(", ", "-");
        str = str.substring(1, str.length() - 1);
        FileWriter fw = new FileWriter("day20\\d.txt");
        fw.write(str);
        fw.close();
    }
}
