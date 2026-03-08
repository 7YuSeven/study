package com.javaproject;

import java.util.TreeSet;

public class Test08 {
    public static void main(String[] args) {
        Student2 s1 = new Student2("zhangsan", 18);
        Student2 s2 = new Student2("lisi", 19);
        Student2 s3 = new Student2("wangwu", 20);

        TreeSet<Student2> treeSet = new TreeSet<>();

        treeSet.add(s1);
        treeSet.add(s2);
        treeSet.add(s3);

        System.out.println(treeSet);
    }
}
