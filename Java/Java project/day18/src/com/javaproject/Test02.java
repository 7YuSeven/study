package com.javaproject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.Stream;

public class Test02 {
    public static void main(String[] args) {
        //单列集合
        ArrayList<String> list = new ArrayList<String>();
        list.add("张三");
        list.add("李四");
        list.add("张二");
        list.add("张乙");
        list.add("王五");
        list.add("张三丰");
        list.add("张无忌");

        list.stream().filter(s -> s.startsWith("张"))
                .filter(s -> s.length() >= 3)
                .forEach(s -> System.out.println(s));

        //双列集合
        HashMap<String, String> map = new HashMap<>();
        map.put("1", "zhangsan");
        map.put("2", "lisi");
        map.put("3", "wangwu");
        map.put("4", "zhaoliu");

        //第一种获取
        map.keySet().stream().forEach(s -> System.out.println(s));
        //第二种
        map.entrySet().stream().forEach(entry -> System.out.println(entry));

        //数组
        int[] arr = {1,2,3,4,5};
        String[] str = {"1","2","3","4","5"};

        Arrays.stream(arr).forEach(n -> System.out.println(n));
        Stream.of(arr).forEach(System.out::println);//基本数据类型会输出地址值
        Stream.of(str).forEach(s -> System.out.println(s));//引用数据类型会输出存储的值

        //零散数据
        Stream.of(1,2,3,4,5).forEach(num -> System.out.println(num));
    }
}
