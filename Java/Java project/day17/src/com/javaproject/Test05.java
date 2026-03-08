package com.javaproject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Test05 {
    public static void main(String[] args) {
        /*
        班级里有N个学生
        要求:
        被点到的学生不会再被点到。
        但是如果班级中所有的学生都点完了，
        需要重新开启第二轮点名。
         */

        ArrayList<String> list = new ArrayList<String>();
        ArrayList<String> list2 = new ArrayList();

        Collections.addAll(list, "李四", "王五", "李华", "张三", "钱柳", "赵四", "吴梅", "韩红", "李白", "杜甫");

        Random r = new Random();

        for (int i = 0; i < 2; i++) {
            while (list.size() > 0){
                int index = r.nextInt(list.size());
                list2.add(list.remove(index));
            }

            System.out.println(list2);
            list.addAll(list2);
            list2.clear();
        }
    }
}
