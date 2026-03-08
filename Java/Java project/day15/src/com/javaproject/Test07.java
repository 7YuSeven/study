package com.javaproject;

import java.util.Iterator;
import java.util.TreeSet;
import java.util.function.Consumer;

public class Test07 {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(4);
        treeSet.add(1);
        treeSet.add(5);
        treeSet.add(3);
        treeSet.add(2);

        //迭代器遍历
        Iterator<Integer> it = treeSet.iterator();
        while (it.hasNext()) {
            int i = it.next();
            System.out.println(i);
        }

        System.out.println("============================");

        //增强for
        for (Integer i : treeSet) {
            System.out.println(i);
        }

        System.out.println("============================");

        //lambda表达式遍历
        treeSet.forEach( integer -> System.out.println(integer));
    }
}
