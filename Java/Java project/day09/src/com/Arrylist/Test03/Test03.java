package com.Arrylist.Test03;

import java.util.ArrayList;

public class Test03 {
    public static void main(String[] args) {
        /*
        1.定义"程序员"类,Coder,包含以下成员:
            1.1成员属性:
                name (姓名):String类型，
                age (年龄):int类型，
                like (爱好):String类型

            1.2要求:
                成员变量private修饰
                生成空参构造/满参构造
                生成set/get方法

        2.定义类Test,类中定义main()⽅法，按以下要求编写代码:
            2.1分别创建四个Coder对象，四个对象的属性分别为：
                "王宝强" ,25,”打篮球”、
                "汪峰" ,35,”游泳”、
                "李铁" ,19,”踢足球”、
                "姚明" ,18,”击剑”;
            2.2创建一个ArrayList集合，这个集合里面存储的是Coder类型，分别将上面的四个Coder对象添加到集合中
            2.3遍历这个集合，在遍历的过程中，如果集合中对象的年龄大于30，那么将这个对象的爱好改成”打保龄球”，
                如果对象的年龄小于20， 那么就把这个对象删除。
            2.4正确修改和删除对象后，遍历集合，打印集合里所有对象的所有属性信息到控制台。
            2.5输出格式:
                王宝强----25----打篮球
                汪峰----35----打保龄球
         */

        Coder coder1 = new Coder("王宝强" ,25,"打篮球");
        Coder coder2 = new Coder("汪峰" ,35,"游泳");
        Coder coder3 = new Coder("李铁" ,19,"踢足球");
        Coder coder4 = new Coder("姚明" ,18,"击剑");

        ArrayList<Coder> coderArrayList = new ArrayList<>();

        coderArrayList.add(coder1);
        coderArrayList.add(coder2);
        coderArrayList.add(coder3);
        coderArrayList.add(coder4);

        for (int i = 0; i < coderArrayList.size(); ) {
            if (coderArrayList.get(i).getAge() < 20) {
                coderArrayList.remove(i);
            } else {
                i++;
            }
        }

        for (int i = 0; i < coderArrayList.size(); i++) {
            if (coderArrayList.get(i).getAge() > 30){
                coderArrayList.get(i).setLike("打保龄球");
            }
        }

        for (int i = 0; i < coderArrayList.size(); i++) {
            Coder c = coderArrayList.get(i);
            System.out.println(c.getName() + "---" + c.getAge() + "---" + c.getLike());
        }
    }
}
