package com.javaproject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Test04 {
    public static void main(String[] args) throws IOException {
        /*
        需求：
            一个文件里面存储了班级同学的信息，每一个学生信息占一行。
            格式为：张三-男-23。
            要求通过程序实现随机点名器。
            运行效果：
            70%的概率随机到男生
            30%的概率随机到女生
            总共随机100万次，统计结果。
            注意观察：看生成男生和女生的比例是不是接近于7：3
         */

        int[] arr = {1, 1, 1, 1, 1, 1, 1, 0, 0, 0};

        ArrayList<String> nameList = new ArrayList<>();

        BufferedReader br = new BufferedReader(new FileReader("day22\\name.txt"));
        String line;
        while ((line = br.readLine()) != null) {
            nameList.add(line);
        }
        br.close();

        ArrayList<String> boyList = new ArrayList<>();
        ArrayList<String> girlList = new ArrayList<>();

        for (String str : nameList) {
            if ("男".equals(str.split("-")[1])) {
                boyList.add(str);
            } else {
                girlList.add(str);
            }
        }

        Random r = new Random();

        int t = r.nextInt(arr.length);
        if (arr[t] == 1) {
            Collections.shuffle(boyList);
            System.out.println(boyList.get(0));
        } else {
            Collections.shuffle(girlList);
            System.out.println(girlList.get(0));
        }

        int boyCount = 0;
        int girlCount = 0;

        for (int i = 0; i < 1000000; i++) {
            int index = r.nextInt(arr.length);
            if (arr[index] == 1) {
                boyCount++;
            } else {
                girlCount++;
            }
        }

        System.out.println(boyCount);
        System.out.println(girlCount);
    }
}
