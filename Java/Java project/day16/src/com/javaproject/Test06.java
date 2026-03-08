package com.javaproject;

import java.util.Map;
import java.util.Set;
import java.util.StringJoiner;
import java.util.TreeMap;
import java.util.function.BiConsumer;

public class Test06 {
    public static void main(String[] args) {
        TreeMap<Character, Integer> map = new TreeMap<>();
        
        String str = "aababcabcdabcde";

        for (int i = 0; i < str.length(); i++) {
            if (map.containsKey(str.charAt(i))){
                int count = map.get(str.charAt(i));
                count++;
                map.put(str.charAt(i), count);
            } else {
                map.put(str.charAt(i), 1);
            }
        }

        StringBuilder sb = new StringBuilder();

        Set<Map.Entry<Character, Integer>> entries = map.entrySet();

        for (Map.Entry<Character, Integer> entry : entries) {
            sb.append(entry.getKey()).append(" (").append(entry.getValue()).append(") ");
        }

        StringJoiner sj = new StringJoiner("","","");
        for (Map.Entry<Character, Integer> entry : entries) {
            sj.add(entry.getKey() + "").add("(").add(entry.getValue() + "").add(")");
        }

        System.out.println(sb);
        System.out.println(sj);
    }
}
