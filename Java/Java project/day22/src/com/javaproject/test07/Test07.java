package com.javaproject.test07;

import com.javaproject.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Test07 {
    public static void main(String[] args) throws IOException {
        /*
        TxT文件中事先准备好一些学生信息，每个学生的信息独占一行。
            要求1：每次被点到的学生，再次被点到的概率在原先的基础上降低一半。
            举例：80个学生，点名5次，每次都点到小A，概率变化情况如下：
            第一次每人概率：1.25%。
            第二次小A概率：0.625%。             其他学生概率：1.2579%
            第三次小A概率：0.3125%。            其他学生概率：1.261867%
            第四次小A概率：0.15625%。           其他学生概率：1.2638449%
            第五次小A概率：0.078125%。          其他学生概率：1.26483386%
            提示：本题的核心就是带权重的随机
         */
        ArrayList<Student> students = new ArrayList<Student>();

        BufferedReader br = new BufferedReader(new FileReader("day22\\names.txt"));
        String line;
        while ((line = br.readLine()) != null) {
            String[] arr = line.split("-");
            Student s = new Student(arr[0], arr[1], Integer.parseInt(arr[2]), Double.parseDouble(arr[3]));
            students.add(s);
        }
        br.close();

        double weight = 0;
        //计算总的权重
        for (Student student : students) {
            weight = weight + student.getWeight();
        }

        //计算每个人的占比
        double[] arr = new double[students.size()];
        int index = 0;
        for (Student student : students) {
            arr[index] = student.getWeight() / weight;
            index ++;
        }

        //将每个人分别设置范围
        //0 - 0.1       0.1 - 0.2
        //0.2 - 0.3     0.3 - 0.4
        //0.4 - 0.5
        //0.5 - 0.6     0.6 - 0.7
        //0.7 - 0.8
        //0.8 - 0.9     0.9 - 1.0
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i] + arr[i - 1];
        }

        //获取随机数
        double random = Math.random();
        int num = - Arrays.binarySearch(arr, random) - 1;

        System.out.println(students.get(num));

        //将概率率降低
        double temp = students.get(num).getWeight();
        temp = temp / 2;
        students.get(num).setWeight(temp);

        //将数据写入文件
        BufferedWriter bw = new BufferedWriter(new FileWriter("day22\\names.txt"));
        for (Student student : students) {
            bw.write(student.toString());
            bw.newLine();
        }
        bw.close();
    }
}
