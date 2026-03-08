package com.javaproject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test06 {
    public static void main(String[] args) {
        /*
        定义一个集合，并添加一些整数1，2，3，4，5，6，7，8，9，10
        过滤奇数，只留下偶数。
        并将结果保存起来
         */

        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> newList = list.stream().filter(num -> num % 2 == 0).collect(Collectors.toList());
        System.out.println(newList);

        /*
        练习:
            创建一个ArrayList集合，并添加以下字符串，字符串中前面是姓名，后面是年龄
            “zhangsan，23”
            “lisi，24"
            "wangwu， 25”
            保留年龄大于等于24岁的人，并将结果收集到Map集合中，姓名为键，年龄为值
         */

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("zhangsan,23");
        list1.add("lisi,24");
        list1.add("wangwu,25");

        Map<String, Integer> map = list1.stream().filter(s -> Integer.parseInt(s.split(",")[1]) >= 24)
                .collect(Collectors.toMap(
                        s -> s.split(",")[0],
                        s -> Integer.parseInt(s.split(",")[1])
                ));

        System.out.println(map);

        /*
        现在有两个ArrayList集合
            第一个集合中:存储6名男演员的名字和年龄。第二个集合中:存储6名女演员的名字和年龄。
            姓名和年龄中间用逗号隔开。比如:张三,23
            要求完成如下的操作:
            1，男演员只要名字为3个字的前两人
            2，女演员只要姓杨的，并且不要第一个
            3，把过滤后的男演员姓名和女演员姓名合并到一起
            4，将上一步的演员信息封装成Actor对象。
            将所有的演员对象都保存到List集合中。
            5.
            备注:演员类Actor，属性有:name，age
         */
        ArrayList<String> manActor = new ArrayList<>();
        Collections.addAll(manActor, "张三一,23", "李四,24", "王五六,26", "吴凡,25", "吴京,27", "马家奇,20");

        ArrayList<String> womanActor = new ArrayList<>();
        Collections.addAll(womanActor, "杨颖,20", "赵丽丽,21", "杨幂,22", "宋丹,21", "杨紫,25", "王红,24");

        Stream<String> stream1 = manActor.stream().filter(name -> name.length() == 3).limit(2);

        Stream<String> stream2 = womanActor.stream().filter(name -> name.startsWith("杨")).skip(1);

        List<Actor> actorList = Stream.concat(stream1, stream2)
                .map(s -> new Actor(s.split(",")[0], Integer.parseInt(s.split(",")[1])))
                .collect(Collectors.toList());

        System.out.println(actorList);
    }
}
