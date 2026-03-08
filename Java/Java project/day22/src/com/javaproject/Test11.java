package com.javaproject;

import java.io.*;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Test11 {
    public static void main(String[] args) throws IOException {
        //IO流和Properties结合
        Properties prop = new Properties();

        prop.put("aaa", "111");
        prop.put("bbb", "222");
        prop.put("ccc", "333");
        prop.put("ddd", "444");

//        FileOutputStream fos = new FileOutputStream("day22\\a.properties");
//        prop.store(fos, "test");
//        fos.close();

        FileInputStream fis = new FileInputStream("day22\\a.properties");
        Properties prop2 = new Properties();
        prop2.load(fis);
        fis.close();
        System.out.println(prop2);

//        BufferedWriter bw = new BufferedWriter(new FileWriter("day22\\a.properties"));
//        Set<Map.Entry<Object, Object>> entries = prop.entrySet();
//        for (Map.Entry<Object, Object> entry : entries) {
//            bw.write(entry.getKey() + "=" + entry.getValue());
//            bw.newLine();
//        }
//        bw.close();
    }
}
