package com.javaproject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.IntFunction;

public class Test04 {
    public static void main(String[] args) {
        //stream流的终结
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌", "周芷若", "赵敏", "张强", "张三丰", "张翠山", "张良", "王二麻子", "谢广坤");

        //遍历
        list.stream().forEach(s -> System.out.println(s));

        System.out.println("======================");
        //统计
        long count = list.stream().count();
        System.out.println(count);
        System.out.println("======================");

        //收集流中的数据，放到数组中
//        Object[] array = list.stream().filter(s -> s.length() >= 3).toArray();
//        System.out.println(Arrays.toString(array));

//        String[] array = list.stream().filter(s -> s.length() >= 3).toArray(new IntFunction<String[]>() {
//            @Override
//            public String[] apply(int value) {
//                return new String[value];
//            }
//        });

        String[] array = list.stream().filter(s -> s.length() >= 3).toArray(value -> new String[value]);

        System.out.println(Arrays.toString(array));

    }
}
