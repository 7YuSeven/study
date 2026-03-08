package com.javaproject;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test05 {
    public static void main(String[] args) {
        //收集数据流中的数据，存放到集合中      collect
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌-男-15", "周芷若-女-14", "赵敏-女-13", "张强-男-20",
                "张翠山-男-40", "张良-男-35", "王二麻子-男-37", "谢广坤-男-41");

        //收集到list集合中
        List<String> list1 = list.stream().filter(s -> "男".equals(s.split("-")[1])).collect(Collectors.toList());

        System.out.println(list1);

        System.out.println("-------------------------");

        //收集到set集合中
        Set<String> set = list.stream().filter(s -> s.length() >= 3).collect(Collectors.toSet());
        System.out.println(set);
        System.out.println("-------------------------");

        //收集到map集合中
//        Map<String, Integer> map = list.stream().filter(s -> "男".equals(s.split("-")[1]))
//                .collect(Collectors.toMap(new Function<String, String>() {
//                    @Override
//                    public String apply(String s) {
//                        return s.split("-")[0];
//                    }
//                }, new Function<String, Integer>() {
//                    @Override
//                    public Integer apply(String s) {
//                        return Integer.parseInt(s.split("-")[2]);
//                    }
//                }));
        Map<String, Integer> map = list.stream().filter(s -> "男".equals(s.split("-")[1]))
                .collect(Collectors.toMap(s -> s.split("-")[0],
                        n -> Integer.parseInt(n.split("-")[2])));

        System.out.println(map);


    }
}
