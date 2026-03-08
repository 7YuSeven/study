package com.javaproject;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;

public class Test01 {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        //获取长度
//        System.out.println(list.size());
        //删除元素
//        System.out.println(list.remove("A"));
//        System.out.println(list);
//      //查看是否包含某个元素
//        System.out.println(list.contains("A"));
        //清空集合
//        list.clear();
//        System.out.println(list);
//        查看集合是否为空
//        System.out.println(list.isEmpty());

        //迭代器遍历集合
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            String s = it.next();
            //删除元素使用it迭代器的方法
//            if (s.equals("A")){
//                it.remove();
//            }
            System.out.println(s);
        }

        System.out.println("-----------------------------");

        //增强for遍历
        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("-----------------------------");

        //lambda表达式遍历
//        list.forEach(new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        });

        list.forEach(s -> System.out.println(s));
    }
}
