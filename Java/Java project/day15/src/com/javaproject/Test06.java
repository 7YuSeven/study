package com.javaproject;

import java.util.LinkedHashSet;

public class Test06 {
    public static void main(String[] args) {
        Student1 s1 = new Student1("zhangsan", 18);
        Student1 s2 = new Student1("lisi", 19);
        Student1 s3 = new Student1("wangwu", 20);
        Student1 s4 = new Student1("zhangsan", 18);

        LinkedHashSet<Student1> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(s3);
        linkedHashSet.add(s1);
        linkedHashSet.add(s2);
        linkedHashSet.add(s4);

        System.out.println(linkedHashSet);
    }
}
