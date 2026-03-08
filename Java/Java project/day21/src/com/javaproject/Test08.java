package com.javaproject;

import java.io.*;
import java.util.ArrayList;

public class Test08 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //将多个对象序列化到文件中，如何读取
//        Student s1 = new Student("zhangsan", 20, "南京");
//        Student s2 = new Student("lisi", 21, "北京");
//        Student s3 = new Student("wangwu", 21, "武汉");
//
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("day21\\message.txt"));
//        oos.writeObject(s1);
//        oos.writeObject(s2);
//        oos.writeObject(s3);
//
//        oos.close();

        //读取文件
//        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("day21\\message.txt"));
//        Student stu1 = (Student) ois.readObject();
//        Student stu2 = (Student) ois.readObject();
//        Student stu3 = (Student) ois.readObject();
//
//        System.out.println(stu1);
//        System.out.println(stu2);
//        System.out.println(stu3);
//
//        ois.close();

        //使用集合写入文件
//        Student s1 = new Student("zhangsan", 20, "南京");
//        Student s2 = new Student("lisi", 21, "北京");
//        Student s3 = new Student("wangwu", 21, "武汉");
//
//        ArrayList<Student> students = new ArrayList<Student>();
//        students.add(s1);
//        students.add(s2);
//        students.add(s3);
//
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("day21\\message.txt"));
//        oos.writeObject(students);
//        oos.close();

        //使用集合读取文件
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("day21\\message.txt"));
        ArrayList<Student> list = (ArrayList<Student>) ois.readObject();
        System.out.println(list);
        ois.close();
    }
}
