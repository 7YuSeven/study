package Test02;

import java.util.ArrayList;

public class Test02 {
    public static void main(String[] args) {
        Student student1 = new Student("张三", 18, '男');
        Student student2 = new Student("李四", 25, '男');
        Student student3 = new Student("王五", 21, '男');

        ArrayList<Student> studentArrayList = new ArrayList<>();

        studentArrayList.add(student1);
        studentArrayList.add(student2);
        studentArrayList.add(student3);

        int max = StudentUtil.getMaxAge(studentArrayList);

        System.out.println(max);
    }
}
