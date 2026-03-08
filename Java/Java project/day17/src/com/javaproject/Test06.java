package com.javaproject;

import java.util.*;

public class Test06 {
    public static void main(String[] args) {
        /*
        需求
            定义一个Map集合，键用表示省份名称province，值表示市city，但是市会有多个
            添加完毕后，遍历结果格式如下!
            江苏省=南京市，扬州市，苏州市，无锡市，常州市
            湖北省=武汉市，孝感市，十堰市，宜昌市，鄂州市
            河北省=石家庄市，唐山市，邢台市，保定市，张家口市
         */

        ArrayList<String> list1 = new ArrayList<>();
        Collections.addAll(list1, "南京市", "扬州市", "苏州市", "无锡市", "常州市");

        ArrayList<String> list2 = new ArrayList<>();
        Collections.addAll(list2, "武汉市", "孝感市", "十堰市", "宜昌市", "鄂州市");

        ArrayList<String> list3 = new ArrayList<>();
        Collections.addAll(list3, "石家庄市", "唐山市", "邢台市", "保定市", "张家口市");

        HashMap<String, ArrayList<String>> map = new HashMap<>();

        map.put("江苏省", list1);
        map.put("湖北省", list2);
        map.put("河北省", list3);

        Set<Map.Entry<String, ArrayList<String>>> entries = map.entrySet();
        for (Map.Entry<String, ArrayList<String>> entry : entries) {
            StringBuilder sb = new StringBuilder();
            String key = entry.getKey();
            ArrayList<String> value = entry.getValue();
            sb.append(key + " = ");
            for (int i = 0; i < value.size(); i++) {
                if (i != value.size() - 1) {
                    sb.append(value.get(i) + ", ");
                } else {
                    sb.append(value.get(i));
                }
            }

            System.out.println(sb);
        }
    }
}
