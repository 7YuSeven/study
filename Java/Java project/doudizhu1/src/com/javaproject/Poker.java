package com.javaproject;

import java.util.ArrayList;
import java.util.Collections;

public class Poker {

    //牌盒
    static ArrayList<String> list = new ArrayList<>();

    //准备牌
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

        list.add("小王");
        list.add("大王");
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

        //看牌
        lookPoker("底牌", lord);
        lookPoker("玩家1", player1);
        lookPoker("玩家2", player2);
        lookPoker("玩家3", player3);
    }

    public void lookPoker(String name, ArrayList<String> list) {
        System.out.print(name + ": ");
        for (String s : list) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
}
