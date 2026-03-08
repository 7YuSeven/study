package com.javaproject;

import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Test10 {
    public static void main(String[] args) {
        //Properties作为Map集合对象
        Properties prop = new Properties();

        prop.put("aaa", "111");
        prop.put("bbb", "222");
        prop.put("ccc", "333");
        prop.put("ddd", "444");

        Set<Object> keySet = prop.keySet();
        for (Object key : keySet) {
            System.out.println(key + "=" + prop.get(key));
        }

        Set<Map.Entry<Object, Object>> entries = prop.entrySet();
        for (Map.Entry<Object, Object> entry : entries) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }
    }
}
