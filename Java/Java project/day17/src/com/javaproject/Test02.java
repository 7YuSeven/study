package com.javaproject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Test02 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        //添加元素
        Collections.addAll(list, 10, 22, 13, 24, 5, 16, 27, 8, 19, 34);
        //System.out.println(list);

        //打乱集合元素
        Collections.shuffle(list);
        System.out.println(list);

        //排序
        Collections.sort(list);
        System.out.println(list);

        //根据指定规则排序
//        Collections.sort(list, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o2 - o1;
//            }
//        });
//        System.out.println(list);

        //二分查找
        //System.out.println(Collections.binarySearch(list, 13));

        //拷贝集合
        ArrayList<Integer> list2 = new ArrayList<>();
        Collections.addAll(list2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
        Collections.copy(list2, list);
        System.out.println(list2);

        //使用指定元素填充集合
//        Collections.fill(list2, 15);
//        System.out.println(list2);

        //求最大值和最小值
        int max = Collections.max(list);
        int min = Collections.min(list);
        System.out.println(max);
        System.out.println(min);

        //交换集合中的指定元素
        Collections.swap(list, 2, 3);
        System.out.println(list);
    }
}
