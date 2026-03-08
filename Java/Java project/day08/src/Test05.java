import java.util.Scanner;

public class Test05 {
    public static void main(String[] args) {
        /*
        字符串反转
            定义一个方法，实现字符串反转。
            键盘录入一个字符串，调用该方法后，在控制台输出结果
            例如，键盘录入 abc，输出结果 cba
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.next();
        String newStr = reversal(str);

        System.out.println(newStr);
    }

    public static String reversal(String str){
        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            newStr = c + newStr;
        }
        return newStr;
    }
}
