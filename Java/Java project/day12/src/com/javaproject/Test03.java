package com.javaproject;

public class Test03 {
    public static void main(String[] args) {
        String phone = "18762010380";
        System.out.println(phone.matches("1[3-9]\\d{9}"));

        String email = "test@gmail.com";
        System.out.println(email.matches("\\w+@[\\w&&[^_]]{2,6}(\\.[a-zA-Z]{2,3}){1,2}"));

        String code = "yzhs2";
        System.out.println(code.matches("[\\w&&[^_]]+"));


        String username = "cyh123";
        System.out.println(username.matches("\\w{4,16}"));

        String id = "320804200206275115";
        System.out.println(id.matches("[1-9]\\d{5}(18|19|20)\\d{2}(0[1-9]|1[0-2])(0[1-9]|[1,2]\\d|3[01])\\d{3}[\\dXx]"));
    }
}
