package com.javaproject;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class Test05 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        //编码和解码
        String str = "你好";
        byte[] bytes = str.getBytes();
        System.out.println(Arrays.toString(bytes));

        byte[] bytes1 = str.getBytes("GBK");
        System.out.println(Arrays.toString(bytes1));

        String newStr = new String(bytes, "UTF-8");
        System.out.println(newStr);

        String newStr1 = new String(bytes1, "GBK");
        System.out.println(newStr1);
    }
}
