package com.javaproject;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Test01 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        //添加元素
        map.put("一", "张三");
        map.put("二", "李四");
        map.put("三", "王五");

        String s = map.put("一", "赵六");
        System.out.println(s);
        System.out.println(map);

        //删除
//        map.remove("二");
//        System.out.println(map);

//        //清空
//        map.clear();
//        System.out.println(map);

        //判断集合是否有指定的键
        System.out.println(map.containsKey("二"));

        //判断集合是否有指定的值
        System.out.println(map.containsValue("王五"));

        //判断集合是否为空
        System.out.println(map.isEmpty());

        //查看集合的长度
        System.out.println(map.size());

        System.out.println("===================================");

        //遍历===键找值
        Set<String> sets = map.keySet();

        for (String set : sets) {
            String value = map.get(set);
            System.out.println(set + "=" + value);
        }

        System.out.println("===================================");

        Iterator<String> it = map.keySet().iterator();
        while (it.hasNext()){
            String key = it.next();
            String value = map.get(key);
            System.out.println(key + "=" + value);
        }

        System.out.println("===================================");

        sets.forEach(s1 -> System.out.println(s1 + "=" + map.get(s)));

        System.out.println("===================================");

        //通过键值对对象进行遍历
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "=" + value);
        }

        System.out.println("===================================");

        Iterator<Map.Entry<String, String>> it2 = map.entrySet().iterator();
        while (it2.hasNext()){
            Map.Entry<String, String> entry = it2.next();
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "=" + value);
        }

        System.out.println("===================================");

        entries.forEach(stringStringEntry -> {
                String key = stringStringEntry.getKey();
                String value = stringStringEntry.getValue();
                System.out.println(key + "=" + value);
            }
        );

        System.out.println("===================================");

        //第三种遍历
        map.forEach(( s2,  s3) -> System.out.println(s2 + "=" + s3));

    }
}
