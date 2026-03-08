package com.javaproject;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test01 {
    public static void main(String[] args) throws IOException {
        /*
            制造假数据：
            获取姓氏:https://hanyu.baidu.com/shici/detail?pid=0b2f26d4c0ddb3ee693fdb1137ee1b0d&from=kge
            获取男生名字：http://www.haoming8.cn/baobao/10881.html
            获取女生名字:http://www.haoming8.cn/baobao/7641.html
         */
        //变量存储网址
        String surnameUrl = "https://hanyu.baidu.com/shici/detail?pid=0b2f26d4c0ddb3ee693fdb1137ee1b0d&from=kge";
        String boyNameUrl = "http://www.haoming8.cn/baobao/10881.html";
        String girlNameUrl = "http://www.haoming8.cn/baobao/7641.html";

        //爬取数据
        String surnameStr = getUrlData(surnameUrl);
        String boyNameStr = getUrlData(boyNameUrl);
        String girlNameStr = getUrlData(girlNameUrl);

        //筛选数据
        ArrayList<String> surnameTempList = getRightData(surnameStr, "([\\u4E00-\\u9FA5]{4})(，|。)", 1);
        ArrayList<String> boyNameTempList = getRightData(boyNameStr, "([\\u4E00-\\u9FA5]{2})(、|。)", 1);
        ArrayList<String> girlNameTempList = getRightData(girlNameStr, "([\\u4E00-\\u9FA5]{2} ){4}([\\u4E00-\\u9FA5]{2})", 0);

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

        //将数据存入文件中
        FileWriter fw = new FileWriter("day22\\name.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        for (String s : nameSet) {
            bw.write(s);
            bw.newLine();
        }
        bw.close();

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

    //筛选数据
    public static ArrayList<String> getRightData(String str, String regex, int index){
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        ArrayList<String> list = new ArrayList<>();
        while (matcher.find()) {
            String s = matcher.group(index);
            list.add(s);
        }
        return list;
    }

    //爬取数据
    public static String getUrlData(String url) throws IOException {
        StringBuilder sb = new StringBuilder();
        URL u = new URL(url);
        URLConnection urlConnection = u.openConnection();

        InputStreamReader isr = new InputStreamReader(urlConnection.getInputStream());
        int ch;
        while ((ch = isr.read()) != -1) {
            sb.append((char) ch);
        }
        isr.close();
        return sb.toString();
    }
}
