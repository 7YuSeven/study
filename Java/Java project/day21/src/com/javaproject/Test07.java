package com.javaproject;

import java.io.*;

public class Test07 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //利用序列化流，把一个对象写道本地文件
        Student s1 = new Student("zhangsan", 20, "南京");

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("day21\\d.txt"));
        oos.writeObject(s1);
        oos.close();

        //反序列化流
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("day21\\d.txt"));
        System.out.println(ois.readObject());
        ois.close();
    }
}
