import java.util.Scanner;

public class Test03 {
    public static void main(String[] args) {
        /*
        键盘录入一个字符串，统计该字符串中大写字母字符，小写字母字符，数字字符出现的次数
            (不考虑其他字符)
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.next();

        int numberCount = 0;
        int majusculeCount = 0;
        int lowercaseCount = 0;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (c >= '0' && c <= '9') {
                numberCount++;
            } else if (c >= 'a' && c <= 'z') {
                lowercaseCount++;
            } else if (c >= 'A' && c <='Z') {
                majusculeCount++;
            }
        }

        System.out.println("数字有" + numberCount);
        System.out.println("大写字母有" + majusculeCount);
        System.out.println("小写字母有" + lowercaseCount);
    }
}
