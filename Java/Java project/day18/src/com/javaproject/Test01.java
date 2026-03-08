package com.javaproject;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test01 {
    public static void main(String[] args) {
        //创建list不可变集合
        List<Integer> list = List.of(1,2,3,4,5,6);

        for (Integer i : list) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("-------------------");

        //创建set集合
        Set<Integer> set = Set.of(1,2,3,4,5,6);

        for (Integer i : set) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("-------------------");

        //创建map不可变集合
        Map<Integer, String> map = Map.of(1,"zhangsan", 2, "lisi", 3, "wangwu", 4, "zhaoliu");

        map.forEach((k, v) -> System.out.println(k + "=" + v));

        System.out.println("-------------------");

        //创建map不可变集合,超过10个
        HashMap<String, String> hm = new HashMap<>();
        hm.put("1", "zhangsan");
        hm.put("2", "lisi");
        hm.put("3", "wangwu");
        hm.put("4", "zhaoliu");

        Set<Map.Entry<String, String>> entries = hm.entrySet();
//        Map.Entry[] mapEntries = new Map.Entry[0];
//        Map.Entry[] entries1 = entries.toArray(mapEntries);

        //Map maps = Map.ofEntries(entries.toArray(new Map.Entry[0]));

        Map maps = Map.copyOf(hm);

        maps.forEach((k, v) -> System.out.println(k + "=" + v));

    }
}
