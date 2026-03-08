package com.javaprojecat;

import java.util.ArrayList;
import java.util.Random;

//工具类
public class CodeUtil {
    //生成验证码
    public static String getCode() {
        String code = "";
        ArrayList<Character> chars = new ArrayList<Character>();
        for (int i = 0; i < 52; i++) {
            if (i < 26) {
                chars.add((char) (i + 65));
            } else {
                chars.add((char) (i + 97 - 26));
            }
        }

        Random r = new Random();
        for (int i = 0; i < 4; i++) {
            int index = r.nextInt(chars.size());
            char c = chars.get(index);
            code = code + c;
        }

        int num = r.nextInt(10);
        code = code + num;

        char[] charArr = code.toCharArray();
        for (int i = 0; i < charArr.length; i++) {
            int index = r.nextInt(charArr.length);
            char c = charArr[index];
            charArr[index] = charArr[i];
            charArr[i] = c;
        }

        return new String(charArr);
    }
}
