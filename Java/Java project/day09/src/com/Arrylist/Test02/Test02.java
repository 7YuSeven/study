package com.Arrylist.Test02;

import java.util.ArrayList;

public class Test02 {
    public static void main(String[] args) {
        /*
        1.定义一个 Person 类
            (1)属性:
                编号 id ( int 类型 )
                姓名 name（String 类型）
                性别 sex （String 类型）
            (2)要求:
                成员变量private修饰
                生成空参构造/满参构造
                生成set/get方法
        2. 在测试类中创建 6 个对象（对象数据如下），依次将 Person 对象存入ArrayList集合对象中。
            1,"尼古拉斯","男"
            2,"马尔扎哈","男"
            3,"迪丽热巴","女"
            4,"阿凡提买买提","男"
            5,"王宝强","男"
            6,"柳岩","女"
        3. 遍历集合删除其中性别为男且姓名长度大于等于 3 的元素，将剩余的元素数据打印在控制台。
            打印如下:
            id:3    性别:女    姓名:迪丽热巴
            id:6    性别:女    姓名:柳岩
         */

        Person person1 = new Person(1,"尼古拉斯","男");
        Person person2 = new Person(2,"马尔扎哈","男");
        Person person3 = new Person(3,"迪丽热巴","女");
        Person person4 = new Person(4,"阿凡提买买提","男");
        Person person5 = new Person(5,"王宝强","男");
        Person person6 = new Person(6,"柳岩","女");

        ArrayList<Person> personArrayList = new ArrayList<>();

        personArrayList.add(person1);
        personArrayList.add(person2);
        personArrayList.add(person3);
        personArrayList.add(person4);
        personArrayList.add(person5);
        personArrayList.add(person6);

        for (int i = 0; i < personArrayList.size(); ) {
            if (personArrayList.get(i).getSex().equals("男") && personArrayList.get(i).getName().length() >= 3) {
                personArrayList.remove(i);
            } else {
                i++;
            }
        }

        for (int i = 0; i < personArrayList.size(); i++) {
            Person p = personArrayList.get(i);
            System.out.println("id:" + p.getId() + "\t性别:" + p.getSex() + "\t姓名:" + p.getName());
        }
    }
}
