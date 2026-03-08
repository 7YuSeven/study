package com.javaproject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

public class Poker {
    //准备牌
    static HashMap<Integer, String> map = new HashMap<>();
    static ArrayList<Integer> list = new ArrayList<>();

    static {
        //花色
        String[] color = {"♠", "♦", "♣", "♥"};
        //数字
        String[] poker = {"3" , "4" , "5" , "6" , "7" , "8" , "9", "10", "J", "Q", "K", "A", "2"};

        //计数器
        int count = 1;
        for (String p : poker) {
            for (String c : color) {
                map.put(count, c + p);
                list.add(count);
                count++;
            }
        }
        list.add(count);
        map.put(count, "小王");
        count++;
        list.add(count);
        map.put(count, "大王");
    }

    Poker() {
        //洗牌
        Collections.shuffle(list);

        //发牌
        TreeSet<Integer> lord = new TreeSet<>();
        TreeSet<Integer> player1 = new TreeSet<>();
        TreeSet<Integer> player2 = new TreeSet<>();
        TreeSet<Integer> player3 = new TreeSet<>();

        for (int i = 0; i < list.size(); i++) {
            if (i < 3) {
                lord.add(list.get(i));
            } else if (i % 3 == 0) {
                player1.add(list.get(i));
            } else if (i % 3 == 1) {
                player2.add(list.get(i));
            } else if (i % 3 == 2) {
                player3.add(list.get(i));
            }
        }

        //看牌
        lookPoker("底牌：", lord);
        lookPoker("玩家1：", player1);
        lookPoker("玩家2：", player2);
        lookPoker("玩家3：", player3);

    }

    //看牌
    public void lookPoker(String name, TreeSet<Integer> list) {
        System.out.print(name + ": ");
        for (int i : list) {
            System.out.print(map.get(i) + " ");
        }
        System.out.println();
    }
}
