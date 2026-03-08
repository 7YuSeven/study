package com.javaproject.test03;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;

public class Test03 {
    public static void main(String[] args) throws IllegalAccessException, IOException {
        /*
        对于任意一个对象，都可以把对象所有的字段名和值，保存到文件中去
         */
        Student student = new Student("张三", 18, "男", "南京");
        Teacher teacher = new Teacher("李四", 30);

        saveObject(teacher);
    }

    private static void saveObject(Object obj) throws IllegalAccessException, IOException {
        Class c = obj.getClass();

        Field[] fields = c.getDeclaredFields();
        BufferedWriter bw = new BufferedWriter(new FileWriter("day25\\src\\com\\javaproject\\test03\\a.txt"));

        for (Field field : fields) {
            field.setAccessible(true);
            String name = field.getName();
            Object value = field.get(obj);

            bw.write(name + ":" + value);
            bw.newLine();
        }

        bw.close();
    }
}
