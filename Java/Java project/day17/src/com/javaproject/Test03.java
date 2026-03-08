package com.javaproject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Test03 {
    public static void main(String[] args) {
        /*
        班级里有N个学生，学生属性:姓名，年龄，性别:
        实现随机点名器
         */

        ArrayList<String> list = new ArrayList<String>();

        Collections.addAll(list, "李四", "王五", "李华", "张三", "钱柳", "赵四", "吴梅", "韩红", "李白", "杜甫");

//        Random r = new Random();
//        int index = r.nextInt(list.size());
//        System.out.println(list.get(index));

        Collections.shuffle(list);
        System.out.println(list.get(0));
    }
}
