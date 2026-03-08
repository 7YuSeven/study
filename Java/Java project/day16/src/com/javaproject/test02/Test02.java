package com.javaproject.test02;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

public class Test02 {
    public static void main(String[] args) {
        HashMap<Student, String> map = new HashMap<>();

        Student s1 = new Student("zhangsan", 20);
        Student s2 = new Student("lisi", 21);
        Student s3 = new Student("wangwu", 22);
        Student s4 = new Student("wangwu", 22);

        map.put(s1, "江苏");
        map.put(s2, "浙江");
        map.put(s4, "上海");
        map.put(s4, "山东");

        map.forEach(new BiConsumer<Student, String>() {
            @Override
            public void accept(Student student, String s) {
                System.out.println(student + "=" + s);
            }
        });

        System.out.println("====================================");

        Set<Student> set = map.keySet();
        for (Student student : set) {
            String value = map.get(student);
            System.out.println(student + "=" + value);
        }

        System.out.println("====================================");

        Set<Map.Entry<Student, String>> entries = map.entrySet();

        for (Map.Entry<Student, String> entry : entries) {
            Student student = entry.getKey();
            String value = entry.getValue();
            System.out.println(student + "=" + value);
        }
    }
}
