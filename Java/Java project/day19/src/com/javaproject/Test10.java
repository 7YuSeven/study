package com.javaproject;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test10 {
    public static void main(String[] args) {
        /*
        需求:统计一个文件夹中每种文件的个数并打印。(考虑子文件夹)
            打印格式如下:
            txt:3个
            doc:4个
            jPg:6个
        统计使用map集合
         */
        File file = new File("D:\\Java\\abc");
        HashMap<String, Integer> fileNum = getFileNum(file);
        System.out.println(fileNum);

    }

    public static HashMap<String, Integer> getFileNum(File file) {
        HashMap<String, Integer> map = new HashMap<>();

        File[] files = file.listFiles();
        //遍历
        for (File src : files) {
            //判断是否为文件
            if (src.isFile()) {
                //获取文件名
                String name = src.getName();
                //按.分割字符串
                String[] strs = name.split("\\.");
                //判断数组长度是否大于2，要考虑无后缀的文件（长度为1）
                if (strs.length >= 2) {
                    //获取后缀名
                    String last = strs[strs.length - 1];
                    //判断集合中是否存在该后缀
                    if (map.containsKey(last)){
                        //存在，加1
                        int count = map.get(last);
                        count ++;
                        map.put(last, count);
                    } else {
                        //不存在，添加
                        map.put(last, 1);
                    }
                }
            } else {
                //用集合获取返回值
                HashMap<String, Integer> tempMap = getFileNum(src);
                Set<Map.Entry<String, Integer>> entries = tempMap.entrySet();
                //遍历
                for (Map.Entry<String, Integer> entry : entries) {
                    //获取键和值
                    String key = entry.getKey();
                    Integer value = entry.getValue();
                    //判断子文件夹获取的集合中的键在父文件夹中是否存在
                    if (map.containsKey(key)){
                        //存在则将二者的值相加
                        int count = map.get(key);
                        count = count + value;
                        map.put(key, count);
                    } else {
                        //不存在则添加
                        map.put(key, value);
                    }
                }
            }
        }

        return map;
    }
}
