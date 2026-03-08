package com.javaproject;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.util.ReUtil;
import cn.hutool.http.HttpUtil;

import java.util.*;

public class Test02 {
    public static void main(String[] args) {
        //获取网址
        String surnameUrl = "https://hanyu.baidu.com/shici/detail?pid=0b2f26d4c0ddb3ee693fdb1137ee1b0d&from=kge";
        String boyNameUrl = "http://www.haoming8.cn/baobao/10881.html";
        String girlNameUrl = "http://www.haoming8.cn/baobao/7641.html";

        String surnameStr = HttpUtil.get(surnameUrl);
        String boyNameStr = HttpUtil.get(boyNameUrl);
        String girlNameStr = HttpUtil.get(girlNameUrl);

        List<String> surnameTempList = ReUtil.findAll("([\\u4E00-\\u9FA5]{4})(，|。)", surnameStr, 1);
        List<String> boyNameTempList = ReUtil.findAll("([\\u4E00-\\u9FA5]{2})(、|。)", boyNameStr, 1);
        List<String> girlNameTempList = ReUtil.findAll("([\\u4E00-\\u9FA5]{2} ){4}([\\u4E00-\\u9FA5]{2})", girlNameStr, 0);

        //整理数据
        ArrayList<String> surnameList = new ArrayList<>();
        for (String s : surnameTempList) {
            for (int i = 0; i < s.length(); i++) {
                surnameList.add(s.charAt(i) + "");
            }
        }

        ArrayList<String> boyNameList = new ArrayList<>();
        for (String s : boyNameTempList) {
            if (!boyNameList.contains(s)) {
                boyNameList.add(s);
            }
        }

        ArrayList<String> girlNameList = new ArrayList<>();
        for (String s : girlNameTempList) {
            String[] strs = s.split(" ");
            for (String str : strs) {
                if (!girlNameList.contains(str)) {
                    girlNameList.add(str);
                }
            }
        }

        //获取随机姓名
        HashSet<String> nameSet = getName(surnameList, boyNameList, girlNameList, 10, 20);

        //将数据写入文件
        FileUtil.writeLines(nameSet, "name.txt", "UTF-8");
    }

    //获取随机姓名
    public static HashSet<String> getName(ArrayList<String> surnameList, ArrayList<String> boyNameList, ArrayList<String> girlNameList, int boys, int girls) {
        HashSet<String> nameSet = new HashSet<>();
        Random r = new Random();

        //男生
        for (int i = 0; i < boys; i++) {
            Collections.shuffle(surnameList);
            Collections.shuffle(boyNameList);

            //18 - 30
            int age = r.nextInt(13) + 18;

            nameSet.add(surnameList.get(0) + boyNameList.get(0) + "-男-" + age);
        }

        //女生
        for (int i = 0; i < girls; i++) {
            Collections.shuffle(surnameList);
            Collections.shuffle(girlNameList);

            //18 - 27
            int age = r.nextInt(10) + 18;

            nameSet.add(surnameList.get(0) + girlNameList.get(0) + "-女-" + age);
        }

        return nameSet;
    }
}
