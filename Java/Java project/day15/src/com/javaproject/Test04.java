package com.javaproject;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Consumer;

public class Test04 {
    public static void main(String[] args) {
        //创建Set对象
        Set<String> set = new HashSet<String>();

        set.add("张三");
        set.add("李四");
        boolean b1 = set.add("王五");
        boolean b2 = set.add("王五");

        System.out.println(b1);
        System.out.println(b2);

        System.out.println(set);

        //迭代器遍历
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            String s = it.next();
            System.out.println(s);
        }

        System.out.println("--------------------------");

        //增强for遍历
        for (String s : set) {
            System.out.println(s);
        }

        System.out.println("--------------------------");

        //lambda表达式遍历
        set.forEach(s -> System.out.println(s));

        Student1 s1 = new Student1("zhangsan", 18);
        Student1 s2 = new Student1("zhangsan", 18);

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
    }
}
