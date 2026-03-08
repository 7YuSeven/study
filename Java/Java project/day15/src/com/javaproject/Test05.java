package com.javaproject;

import java.util.ArrayList;
import java.util.HashSet;

public class Test05 {
    public static void main(String[] args) {
        Student1 s1 = new Student1("zhangsan", 18);
        Student1 s2 = new Student1("lisi", 19);
        Student1 s3 = new Student1("wangwu", 20);
        Student1 s4 = new Student1("zhangsan", 18);

        HashSet<Student1> set = new HashSet<>();
        set.add(s3);
        set.add(s1);
        set.add(s2);
        set.add(s4);

        System.out.println(set);
    }
}
