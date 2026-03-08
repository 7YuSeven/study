package com.javaproject;

import java.util.Comparator;
import java.util.TreeSet;

public class Test09 {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int i = o1.length() - o2.length();
                i = i==0 ? o1.compareTo(o2) : i;
                return i;
            }
        });
        treeSet.add("basca");
        treeSet.add("csa");
        treeSet.add("aqwe");
        treeSet.add("oikj");

        System.out.println(treeSet);
    }
}
