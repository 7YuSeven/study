package com.javaproject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;
import java.util.stream.Stream;

public class Test03 {
    public static void main(String[] args) {
        //修改stream中的数据不归改变原来集合或数组中的值
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌", "张无忌", "周芷若", "赵敏", "张强", "张三丰", "张翠山", "张良", "王二麻子", "谢广坤");

        //过滤
        list.stream().filter(s -> s.length() > 3).forEach(s -> System.out.println(s));

        System.out.println("--------------------------");

        //获取前几个元素
        list.stream().limit(3).forEach(s -> System.out.println(s));

        System.out.println("--------------------------");

        //跳过前几个元素
        list.stream().skip(3).forEach(s -> System.out.println(s));
        System.out.println("--------------------------");

        //去重
        list.stream().distinct().forEach(s -> System.out.println(s));

        System.out.println("--------------------------");

        //合并a,b两个流为一个流
        ArrayList<String> list2 = new ArrayList<>();
        Collections.addAll(list2, "张三", "李四");

        Stream.concat(list.stream(), list2.stream()).forEach(s -> System.out.println(s));
        System.out.println("--------------------------");

        //转换数据类型
        ArrayList<String> list3 = new ArrayList<>();
        Collections.addAll(list3, "张三-15", "李四-25", "王五-18");
//        list3.stream().map(new Function<String, Integer>() {
//            @Override
//            public Integer apply(String s) {
//                return Integer.parseInt(s.split("-")[1]);
//            }
//        }).forEach(s -> System.out.println(s));
        list3.stream().map(s -> Integer.parseInt(s.split("-")[1]))
                .forEach(s -> System.out.println(s));
    }
}
