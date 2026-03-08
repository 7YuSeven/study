import java.util.Random;
import java.util.Scanner;

public class Test12 {
    public static void main(String[] args) {
        /*
        键盘输入任意字符串，打乱里面内容
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.next();

        char[] arr = str.toCharArray();

        Random r = new Random();

        for (int i = 0; i < arr.length; i++) {
            int index = r.nextInt(arr.length);

            char c = arr[i];
            arr[i] = arr[index];
            arr[index] = c;
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
        }

        String newStr = sb.toString();

        System.out.println(newStr);
    }
}
