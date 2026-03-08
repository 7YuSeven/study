package com.javaproject;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Function;

public class Test07 {
    public static void main(String[] args) {
        //引用静态方法
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "1", "2", "3", "4", "5", "6", "7", "8", "9");

        list.stream().map(Integer::parseInt).forEach(System.out::println);

        System.out.println("-----------------------------");

        //引用成员方法
        ArrayList<String> list1 = new ArrayList<>();
        Collections.addAll(list1, "张无忌", "周芷若", "赵敏", "张强", "张三丰", "张翠山", "张良", "王二麻子", "谢广坤");

        list1.stream().filter(new StringObject()::getName).forEach(System.out::println);

        System.out.println("-----------------------------");

        list1.stream().filter(new Test07()::getName).forEach(System.out::println);

        System.out.println("-----------------------------");

        //引用构造方法
        ArrayList<String> list2 = new ArrayList<>();
        Collections.addAll(list2, "张无忌,22", "周芷若,18", "赵敏,30", "张强,21", "张三丰,100", "张翠山,50", "张良,20");

        list2.stream().map(Student::new).forEach(System.out::println);

        System.out.println("----------------------------");

        //使用类名引用成员方法
        ArrayList<String> list3 = new ArrayList<>();
        Collections.addAll(list3, "aaa", "bbb", "ccc", "ddd", "eee", "fff");

//        list3.stream().map(new Function<String, String>() {
//            @Override
//            public String apply(String s) {
//                return s.toUpperCase();
//            }
//        }).forEach(System.out::println);
        //第一个参数：表示被引用的方法的调用者，决定了可以调用类中的何种方法
        //          如果流中的数据都是字符串，则只能调用String中的方法
        //第二个参数至最后： 跟别引用的数据类型一致，如果没有则说明引用方法是无参的
        list3.stream().map(String::toUpperCase).forEach(System.out::println);

        System.out.println("----------------------------");

        //引用数组的构造方法
        ArrayList<Integer> list4 = new ArrayList<>();
        Collections.addAll(list4, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Integer[] array = list4.stream().toArray(Integer[]::new);
        System.out.println(Arrays.toString(array));
    }

    public boolean getName(String s){
        return s.startsWith("张");
    }
}
