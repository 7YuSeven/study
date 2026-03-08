package com.itheima.util;

import java.util.ArrayList;
import java.util.Random;

public class CodeUtil {

    public static String getCode(){
      //自己练习
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < 52; i++) {
            if (i < 26){
                list.add((char)('a' + i));
            } else {
                list.add((char)('A' + i - 26));
            }
        }
        Random r = new Random();
        StringBuilder sb = new StringBuilder();

//        //包含大小写A-Z和数字0-9，总共长度为4或5，内容都是随机的，但是数字不能连续
//        for (int i = 0; i < 10; i++) {
//            list.add((char)(48 + i));
//        }

//        int length = r.nextInt(2) + 4;
//        char c = ' ';
//
//        for (int i = 0; i < length;) {
//            int index = r.nextInt(list.size());
//            if (Character.isDigit(list.get(index)) && Character.isDigit(c)) {
//                continue;
//            }
//            sb.append(list.get(index));
//            c = list.get(index);
//            i++;
//        }
//
//        System.out.println(sb.toString());

        for (int i = 0; i < 4; i++) {
            int index = r.nextInt(list.size());
            //不包含大写和小写字母o
//            if (list.get(index) != 'o' && list.get(index) != 'O'){
//                sb.append(list.get(index));
//            }
            sb.append(list.get(index));
        }

        int number = r.nextInt(10);
        sb.append(number);

        char[] chars = sb.toString().toCharArray();

        for (int i = 0; i < chars.length; i++) {
            int index = r.nextInt(chars.length);

            char temp = chars[i];
            chars[i] = chars[index];
            chars[index] = temp;
        }

        return new String(chars);
    }
}