package com.javaproject;

import java.util.TreeSet;

public class Test10 {
    public static void main(String[] args) {
        Student3 s1 = new Student3("zhangsan", 23, 90, 99, 50);
        Student3 s2 = new Student3("lisi", 24, 90, 98, 50);
        Student3 s3 = new Student3("wangwu", 25, 95, 100, 30);
        Student3 s4 = new Student3("zhaoliu", 26, 60, 99, 70);
        Student3 s5 = new Student3("qianqi", 26, 70, 80, 70);

        TreeSet<Student3> treeSet = new TreeSet<>();
        treeSet.add(s1);
        treeSet.add(s2);
        treeSet.add(s3);
        treeSet.add(s4);
        treeSet.add(s5);

        for (Student3 student3 : treeSet) {
            System.out.println(student3);
            int sum = student3.getChinese() + student3.getMath() + student3.getEnglish();
            System.out.println("分数总和为" + sum);
        }
    }
}
