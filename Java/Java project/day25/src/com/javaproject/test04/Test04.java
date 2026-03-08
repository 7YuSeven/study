package com.javaproject.test04;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class Test04 {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        /*
        反射可以跟配置文件结合的方式，动态的创建对象，并调用方法
         */

        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream("day25\\src\\com\\javaproject\\test04\\prop.properties");
        prop.load(fis);
        fis.close();
        System.out.println(prop);

        String classname = (String) prop.get("classname");
        String method = (String) prop.get("method");

        System.out.println(classname);
        System.out.println(method);

        Class<?> c = Class.forName(classname);
        //获取构造方法
        Constructor con = c.getDeclaredConstructor();
        Object o = con.newInstance();
        System.out.println(o);

        //获取成员方法并运行
        Method m = c.getDeclaredMethod(method);
        m.setAccessible(true);
        m.invoke(o);

    }
}
