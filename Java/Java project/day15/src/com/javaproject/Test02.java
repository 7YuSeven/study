package com.javaproject;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Consumer;

public class Test02 {
    public static void main(String[] args) {
        //创建集合
        List<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");

        //在指定位置插入元素
        list.add(1,"D");
        System.out.println(list);

        //删除元素
//        list.remove(0);
        list.remove("A");

        System.out.println(list);

        //修改指定位置的元素
        String s = list.set(0, "E");
        System.out.println(s);
        System.out.println(list);

        //获取指定位置的元素
        String s1 = list.get(0);
        System.out.println(s1);

        System.out.println("-----------------------------");

        //for循环遍历
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("-----------------------------");

        //迭代器遍历
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            String str = it.next();
            System.out.println(str);
        }

        System.out.println("-----------------------------");

        //for增强遍历
        for (String string : list) {
            System.out.println(string);
        }

        System.out.println("-----------------------------");

        //lambda表达式遍历
        list.forEach(s2 -> System.out.println(s2));

        System.out.println("-----------------------------");

        //列表迭代器遍历
        ListIterator<String> it2 = list.listIterator();
        while (it2.hasNext()){
            String str = it2.next();
            //可以在遍历时添加元素
            if(str.equals("E")){
                it2.add("F");
            }
        }
        System.out.println(list);
    }
}
