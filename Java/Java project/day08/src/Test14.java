public class Test14 {
    public static void main(String[] args) {
        /*
        注意:需要用己有的知识完成。
        给定两个以字符串形式表示的非负整数num1和num2，返回num1和num2的乘积，它们的乘积也表示为字符串形式。
         */

        String num1 = "1234";
        String num2 = "44";

        int number1 = 0;

        for (int i = 0; i < num1.length(); i++) {
            char c = num1.charAt(i);
            number1 = number1 * 10 + (c - 48);
        }

        int number2 = 0;

        for (int i = 0; i < num2.length(); i++) {
            char c = num2.charAt(i);
            number2 = number2 * 10 + (c - 48);
        }

        int product = number1 * number2;

        String productArr = product + "";

        System.out.println(productArr);
    }
}
