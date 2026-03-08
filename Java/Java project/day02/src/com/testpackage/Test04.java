package com.testpackage;

import java.util.Scanner;

public class Test04 {
    public static void main(String[] args) {
        /*
        需求:
	    动物园里有两只老虎，已知两只老虎的体重分别为180kg、200kg，
	    请用程序实现判断两只老虎的体重是否相同。
         */

        //int tiger1 = 180;
        //int tiger2 = 200;

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一只老虎的体重：");
        int tiger1 = sc.nextInt();

        System.out.println("请输入第二只老虎的体重：");
        int tiger2 = sc.nextInt();

        System.out.println(tiger1 == tiger2 ? "相同" : "不同");
    }
}
