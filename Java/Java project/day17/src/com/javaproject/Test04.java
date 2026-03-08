package com.javaproject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Test04 {
    public static void main(String[] args) {
        /*
        班级里有N个学生
        要求:
        70%的概率随机到男生
        30%的概率随机到女生
         */

        ArrayList<String> boyList = new ArrayList<>();
        ArrayList<String> girlList = new ArrayList<>();

        Collections.addAll(boyList, "李四", "王五", "李华", "张三", "钱柳", "赵四");
        Collections.addAll(girlList, "吴梅", "韩红", "李白", "杜甫");

        ArrayList<Integer> numList = new ArrayList<>();
        Collections.addAll(numList, 1,1,1,1,1,1,1,0,0,0);

        Random r = new Random();
        int index = r.nextInt(numList.size());

        if (numList.get(index) == 1) {
            Collections.shuffle(boyList);
            System.out.println(boyList.get(0));
        } else {
            Collections.shuffle(girlList);
            System.out.println(girlList.get(0));
        }
    }
}
