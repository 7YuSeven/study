package com.javaproject.test05;

import java.util.TreeMap;
import java.util.function.BiConsumer;

public class Test05 {
    public static void main(String[] args) {
        TreeMap<Student, String> map = new TreeMap<>();

        Student s1 = new Student("zhangsan", 20);
        Student s2 = new Student("lisi", 30);
        Student s4 = new Student("zhaoliu", 40);
        Student s3 = new Student("wangwu", 40);

        map.put(s1, "江苏");
        map.put(s2, "浙江");
        map.put(s3, "上海");
        map.put(s4, "山东");

        map.forEach(new BiConsumer<Student, String>() {
            @Override
            public void accept(Student student, String s) {
                System.out.println(student + "=" + s);
            }
        });
    }
}
