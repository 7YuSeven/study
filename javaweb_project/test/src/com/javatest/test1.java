package com.javatest;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class test1 {
    public static void main(String[] args) {
        /*
        1.编写字符串统计程序，该程序可统计字符串里有多少种字符，及每种字符的个数。
        用字符串"yekmaakkccekymbvb"验证该程序。
         */
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < 26; i++) {
            map.put((char) (i + 'a'), 0);
        }

        String strings = "yekmaakkccekymbvb";

        for (int i = 0; i < strings.length(); i++) {
            Character c = strings.charAt(i);

            map.forEach(new BiConsumer<Character, Integer>() {
                @Override
                public void accept(Character character, Integer integer) {
                    if (character.equals(c)){
                        integer++;
                    }
                    map.put(character, integer);
                }
            });
        }

        System.out.println(map);

    }
}
