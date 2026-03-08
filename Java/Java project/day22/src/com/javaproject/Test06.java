package com.javaproject;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Test06 {
    public static void main(String[] args) throws IOException {
        /*
        需求:
            一个文件里面存储了班级同学的姓名，每一个姓名占一行。
            要求通过程序实现随机点名器。
            运行效果：
            被点到的学生不会再被点到
            如果班级中所有的学生都点完了，需要自动的重新开启第二轮点名
            细节1：假设班级有10个学生，每一轮中每一位学生只能被点到一次，程序运行10次，第一轮结束
            细节2：第11次运行的时候，我们自己不需要手动操作本地文件，要求程序自动开始第二轮点名
         */

        ArrayList<String> nameList = new ArrayList<>();

        BufferedReader br = new BufferedReader(new FileReader("day22\\name2.txt"));
        String line;
        while ((line = br.readLine()) != null) {
            nameList.add(line);
        }
        br.close();

        ArrayList<String> tempList = new ArrayList<>();

        BufferedReader br2 = new BufferedReader(new FileReader("day22\\temp.txt"));

        if (nameList.size() == 0){
            String line2;
            while ((line2 = br2.readLine()) != null) {
                nameList.add(line2);
            }

            File file = new File("day22\\temp.txt");
            file.delete();
        }

        String temp;
        while ((temp = br2.readLine()) != null) {
            tempList.add(temp);
        }

        br2.close();

        Collections.shuffle(nameList);
        System.out.println(nameList.get(0));
        tempList.add(nameList.get(0));
        nameList.remove(0);

        BufferedWriter bw = new BufferedWriter(new FileWriter("day22\\name2.txt"));
        for (String s : nameList) {
            bw.write(s);
            bw.newLine();
        }
        bw.close();

        BufferedWriter bw2 = new BufferedWriter(new FileWriter("day22\\temp.txt"));
        for (String s : tempList) {
            bw2.write(s);
            bw2.newLine();
        }
        bw2.close();
    }
}
