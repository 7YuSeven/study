package com.javaproject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Test08 {
    public static void main(String[] args) {
        /*
        集合中存储一些字符串的数据，比如:张三,23。
        收集到Student类型的数组当中(使用方法引用完成)
         */

        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌,22", "周芷若,18", "赵敏,30", "张强,21", "张三丰,100", "张翠山,50", "张良,20");

        Student[] array = list.stream().map(Student::new).toArray(Student[]::new);
        System.out.println(Arrays.toString(array));

        System.out.println("======================");

        /*
        创建集合添加学生对象，学生对象属性:name，age
        只获取姓名并放到数组当中(使用方法引用完成)
         */
        ArrayList<Student1> students = new ArrayList<>();
        students.add(new Student1("张三", 20));
        students.add(new Student1("李四", 21));
        students.add(new Student1("王五", 22));

        String[] strings = students.stream().map(Student1::getName).toArray(String[]::new);
        System.out.println(Arrays.toString(strings));

        System.out.println("===============================");

        /*
        创建集合添加学生对象，学生对象属性:name，age
        把姓名和年龄拼接成:张三-23的字符串，并放到数组当中(使用方法引用完成)
         */
        ArrayList<Student1> student = new ArrayList<>();
        student.add(new Student1("张三", 20));
        student.add(new Student1("李四", 21));
        student.add(new Student1("王五", 22));

        String[] array1 = student.stream().map(Student1::getNewStr).toArray(String[]::new);
        System.out.println(Arrays.toString(array1));
    }
}
