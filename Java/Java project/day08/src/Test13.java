import java.util.Random;

public class Test13 {
    public static void main(String[] args) {
        /*
        生成验证码
            内容:可以是小写字母，也可以是大写字母，还可以是数字
            规则:
            长度为5
            内容中是四位字母，1位数字。
            其中数字只有1位，但是可以出现在任意的位置。
         */

        char[] letter = new char[52];

        for (int i = 0; i < letter.length; i++) {
            if (i < 26) {
                letter[i] = (char)(97 + i);
            } else {
                letter[i] = (char)(65 + i - 26);
            }
        }

        Random r = new Random();

        String str = "";

        for (int i = 0; i < 4; i++) {
            int index = r.nextInt(52);
            str = str + letter[index];
        }

        str = str + r.nextInt(10);

        char[] arr = str.toCharArray();

        int index = r.nextInt(5);

        char c = arr[arr.length - 1];
        arr[arr.length - 1] = arr[index];
        arr[index] = c;

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
        }

        String newStr = sb.toString();

        System.out.println(newStr);
    }
}
