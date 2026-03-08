package com.studentsystem;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentSystem {
    public static void StudengSystem() {
        ArrayList<Student> studentArrayList = new ArrayList<>();
        loop: while(true){
            System.out.println("---------------学生管理系统---------------");
            System.out.println("1：添加学生");
            System.out.println("2：删除学生");
            System.out.println("3：修改学生");
            System.out.println("4：查询学生");
            System.out.println("5：退出");

            Scanner sc = new Scanner(System.in);
            System.out.println("请输入您的选择");
            String choose = sc.next();

            switch (choose){
                case "1" -> addStudent(studentArrayList);
                case "2" -> deleteStudent(studentArrayList);
                case "3" -> updateStudent(studentArrayList);
                case "4" -> searchStudent(studentArrayList);
                case "5" -> {
                    System.exit(0);
                    //break loop;
                }
            }
        }
    }

    //添加学生
    public static void addStudent(ArrayList<Student> studentArrayList){
        Scanner sc = new Scanner(System.in);

        String id;
        while (true) {
            System.out.println("请输入学生id");
            id = sc.next();

            if (checkId(studentArrayList, id)) {
                System.out.println("学生Id重复，请重新输入");
            } else {
                break;
            }
        }

        System.out.println("请输入学生姓名");
        String name = sc.next();

        System.out.println("请输入学生年龄");
        int age = sc.nextInt();

        System.out.println("请输入学生家庭住址");
        String address = sc.next();

        Student student = new Student(id, name, age, address);
        studentArrayList.add(student);
        System.out.println("添加成功");
    }

    //删除学生
    public static void deleteStudent(ArrayList<Student> studentArrayList){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要删除的学生Id");
        String id = sc.next();

        if (checkId(studentArrayList,id)) {
            studentArrayList.remove(getIndex(studentArrayList, id));
        } else {
            System.out.println("该学生不存在");
            return;
        }
        System.out.println("删除成功");
    }

    //修改学生
    public static void updateStudent(ArrayList<Student> studentArrayList){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要修改的学生id");
        String id = sc.next();

        if (!checkId(studentArrayList,id)) {
            System.out.println("该学生不存在");
            return;
        }

        int index = getIndex(studentArrayList, id);
        Student student = studentArrayList.get(index);

        System.out.println("请输入学生姓名");
        String name = sc.next();
        student.setName(name);

        System.out.println("请输入学生年龄");
        int age = sc.nextInt();
        student.setAge(age);

        System.out.println("请输入学生家庭住址");
        String address = sc.next();
        student.setAddress(address);

        System.out.println("修改成功");
    }

    //查询学生信息
    public static void searchStudent(ArrayList<Student> studentArrayList){
        if (studentArrayList.size() == 0) {
            System.out.println("当前无学生信息，请添加后再查询");
            return;
        }

        System.out.println("id\t\t\t姓名\t\t年龄\t\t家庭住址");
        for (int i = 0; i < studentArrayList.size(); i++) {
            Student s = studentArrayList.get(i);
            System.out.println(s.getId() + "\t\t\t" + s.getName() + "\t\t" + s.getAge() + "\t\t" + s.getAddress());
        }
    }

    //判断id是否唯一
    public static boolean checkId(ArrayList<Student> studentArrayList, String id){
//        for (int i = 0; i < studentArrayList.size(); i++) {
//            Student student = studentArrayList.get(i);
//            if (student.getId().equals(id)) {
//                return true;
//            }
//        }
//        return false;
        return getIndex(studentArrayList, id) >= 0;
    }

    //获取学生对象的索引
    public static int getIndex(ArrayList<Student> studentArrayList, String id){
        for (int i = 0; i < studentArrayList.size(); i++) {
            Student student = studentArrayList.get(i);
            if (student.getId().equals(id)) {
                return i;
            }
        }
        return -1;
    }
}
