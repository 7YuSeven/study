package com.javaproject.test05;

public class Test05 {
    public static void main(String[] args) {
        SuperStar superStar = new SuperStar("Jay");
        Star star = ProxyUntil.createProxy(superStar);
        String s = star.sing("晴天");
        System.out.println(s);


        star.dance();
    }
}
