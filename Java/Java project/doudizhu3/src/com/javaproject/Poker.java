package com.javaproject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

public class Poker {
    //准备牌
    static HashMap<String, Integer> map = new HashMap<>();
    static ArrayList<String> list = new ArrayList<>();

    static {
        //花色
        String[] color = {"♠", "♦", "♣", "♥"};
        //数字
        String[] poker = {"3" , "4" , "5" , "6" , "7" , "8" , "9", "10", "J", "Q", "K", "A", "2"};

        for (String c : color) {
            for (String p : poker) {
                list.add(c + p);
            }
        }

        list.add(" 小王");
        list.add(" 大王");

        //给每张牌计算价值
        map.put("J", 11);
        map.put("Q", 12);
        map.put("K", 13);
        map.put("A", 14);
        map.put("2", 15);
        map.put("小王", 16);
        map.put("大王", 17);
    }

    Poker() {
        //洗牌
        Collections.shuffle(list);

        //发牌
        ArrayList<String> lord = new ArrayList<>();
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            if (i < 3){
                lord.add(list.get(i));
            } else if (i % 3 == 0){
                player1.add(list.get(i));
            } else if (i % 3 == 1){
                player2.add(list.get(i));
            } else {
                player3.add(list.get(i));
            }
        }

        //排序
        order(lord);
        order(player1);
        order(player2);
        order(player3);

        //看牌
        lookPoker("底牌", lord);
        lookPoker("玩家1", player1);
        lookPoker("玩家2", player2);
        lookPoker("玩家3", player3);
    }

    //排序
    public void order(ArrayList<String> list) {
        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String color1 = o1.substring(0, 1);
                int v1 = getValue(o1);

                String color2 = o2.substring(0, 1);
                int v2 = getValue(o2);

                int i = v1 - v2;
                return i == 0 ? color1.compareTo(color2) : i;
            }
        });
    }

    //计算价值
    public int getValue(String str){
        String s = str.substring(1);

        if (map.containsKey(s)){
            return map.get(s);
        } else {
            return Integer.parseInt(s);
        }
    }

    //看牌
    public void lookPoker(String name, ArrayList<String> list) {
        System.out.print(name + ": ");
        for (String s : list) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
}
