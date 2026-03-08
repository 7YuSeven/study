import java.util.Scanner;

public class Test16 {
    public static void main(String[] args) {
        /*
         请编写程序，由键盘录入一个字符串，把字符串中的所有字母都变成大写后输出,再把字符串中的所有字母变成小写后输出。
        比如：
            键盘录入字符串:Hello12345World~!#$
            控制台输出:
                转换后的大写字符串: HELLO12345WORLD~!#$
                转换后的小写字符串: hello12345world~!#$
        要求:
            1.定义方法myToUpperCase,完成把方法参数字符串转换成大写字符串并返回转换后的结果
            2.定义方法myToLowerCase,完成把方法参数字符串转换成小写字符串并返回转换后的结果
            3.获取键盘录入的字符串后,分别调用以上两个方法,获取结果字符串并输出
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str= sc.next();

        System.out.println(myToUpperCase(str));
        System.out.println(myToLowerCase(str));


    }

    public static String myToUpperCase(String str){
        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 97 && c <= 122) {
                newStr = newStr + (char) (c - 32);
            } else {
                newStr = newStr + (char) c;
            }
        }

        return newStr;
    }

    public static String myToLowerCase(String str){
        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 65 && c <= 90) {
                newStr = newStr + (char) (c + 32);
            } else {
                newStr = newStr + (char) c;
            }
        }

        return newStr;
    }
}
