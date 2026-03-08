package com.javaproject.test02;

import java.lang.reflect.*;

public class Test02 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        //Class中常用方法
        //获取字节码对象
        Class c = Class.forName("com.javaproject.test02.Student");

        //获取构造方法
        Constructor[] con1 = c.getConstructors();
        for (Constructor constructor : con1) {
            System.out.println(constructor);
        }

        System.out.println("===========================");

        Constructor[] con2 = c.getDeclaredConstructors();
        for (Constructor constructor : con2) {
            System.out.println(constructor);
        }

        System.out.println("===========================");

        Constructor con3 = c.getConstructor(String.class, int.class, String.class);
        System.out.println(con3);

        System.out.println("===========================");

        Constructor con4 = c.getDeclaredConstructor(String.class);
        System.out.println(con4);

        System.out.println("===========================");

        //获取权限修饰符
        int modifiers = con4.getModifiers();
        System.out.println(modifiers);

        System.out.println("===========================");

        Parameter[] parameters = con4.getParameters();
        for (Parameter parameter : parameters) {
            System.out.println(parameter);
        }

        System.out.println("===========================");

        //创建对象
        con4.setAccessible(true);
        Student s = (Student) con4.newInstance("张三");
        System.out.println(s);

        System.out.println("===========================");



        //获取成员变量的方法
        Field[] fields1 = c.getFields();
        for (Field field : fields1) {
            System.out.println(field);
        }

        System.out.println("===========================");

        Field[] fields2 = c.getDeclaredFields();
        for (Field field : fields2) {
            System.out.println(field);
        }

        System.out.println("===========================");

        Field name = c.getField("name");
        System.out.println(name);

        System.out.println("===========================");

        Field age = c.getDeclaredField("age");
        System.out.println(age);

        System.out.println("===========================");

        //获取权限修饰符
        int modifiers1 = name.getModifiers();
        System.out.println(modifiers1);
        //获取变量的名字
        String n = name.getName();
        System.out.println(n);
        //获取变量的类型
        Class<?> type = name.getType();
        System.out.println(type);
        //获取变量的值
        Student s2 = new Student("张三", 28, "南京");
        Field address = c.getDeclaredField("address");
        address.setAccessible(true);
        String add = (String) address.get(s2);
        System.out.println(add);
        //修改变量的值
        address.set(s, "北京");
        System.out.println(s.toString());

        System.out.println("===========================");

        //获取类的成员方法
        //获取所有的方法（包含父类的公共方法）
        Method[] methods = c.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }

        System.out.println("===========================");

        //获取本类的私有方法，不包括父类的方法
        Method[] methods1 = c.getDeclaredMethods();
        for (Method method : methods1) {
            System.out.println(method);
        }

        System.out.println("===========================");

        //获取指定方法
        Method setName = c.getMethod("setName", String.class);
        System.out.println(setName);

        Method setAddress = c.getDeclaredMethod("setAddress", String.class);
        System.out.println(setAddress);

        //获取权限修饰符
        int modifiers2 = setAddress.getModifiers();
        System.out.println(modifiers2);

        //获取参数
        Parameter[] parameters1 = setAddress.getParameters();
        for (Parameter parameter : parameters1) {
            System.out.println(parameter);
        }

        //方法运行
        Method eat = c.getMethod("eat", String.class);
        Student s3 = new Student();
        eat.setAccessible(true);
        String str = (String) eat.invoke(s3, "香蕉");
        System.out.println(str);
    }
}
