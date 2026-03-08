package com.javaproject;

import java.util.*;
import java.util.function.BiConsumer;

public class Test03 {
    public static void main(String[] args) {
        String[] place = {"A", "B", "C", "D"};
        ArrayList<String> list = new ArrayList<>();

        Random r = new Random();
        for (int i = 0; i < 80; i++) {
            int index = r.nextInt(place.length);
            list.add(place[index]);
        }

        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < list.size(); i++) {
            if (map.containsKey(list.get(i))){
                int value = map.get(list.get(i));
                value++;
                map.put(list.get(i), value);
            } else {
                map.put(list.get(i), 1);
            }
        }

        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        int max = 0;
        for (Map.Entry<String, Integer> entry : entries) {
            if (entry.getValue() > max) {
                max = entry.getValue();
            }
        }

        map.forEach(new BiConsumer<String, Integer>() {
            @Override
            public void accept(String s, Integer integer) {
                System.out.println(s + "=" + integer);
            }
        });

        System.out.println(max);
    }
}
