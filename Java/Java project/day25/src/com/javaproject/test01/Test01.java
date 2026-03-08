package com.javaproject.test01;

public class Test01 {
    public static void main(String[] args) throws ClassNotFoundException {
        //获取class对象的三种方式
        //第一种，最为常用
        Class<?> c = Class.forName("com.javaproject.test01.Student");
        System.out.println(c);

        //第二种，更多的当作参数传递
        Class<Student> studentClass = Student.class;
        System.out.println(studentClass);

        //第三种，有了这个类的对象使用
        Student student = new Student();
        Class cl = student.getClass();
        System.out.println(cl);
    }
}
