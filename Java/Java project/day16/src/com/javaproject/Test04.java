package com.javaproject;

import java.util.Comparator;
import java.util.TreeMap;

public class Test04 {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;//降序
                //return o1 - o2;//升序
            }
        });

        map.put(2, "Java");
        map.put(3, "Python");
        map.put(4, "C++");
        map.put(1, "JavaScript");

        System.out.println(map);
    }
}
