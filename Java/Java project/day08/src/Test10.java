import java.util.Scanner;

public class Test10 {
    public static void main(String[] args) {
        /*
        转换罗马数字
            键盘录入一个字符串
            要求1:长度为小于等于9
            要求2:只能是数字
            将内容变成罗马数字
            下面是阿拉伯数字跟罗马数字的对比关系:
            1-1、11-2、11-3、IV-4、V-5、V-6、V-7、V-8、1X-9
            注意点:
            罗马数字里面是没有0的
            如果键盘录入的数字包含0，可以变成””
            (长度为0的字符串)
         */
        Scanner sc = new Scanner(System.in);

        String numberStr;

        while(true) {
            System.out.println("请输入一个字符串");
            numberStr = sc.next();
            if (numberStr.length() < 0 || numberStr.length() > 9) {
                System.out.println("输入的字符串长度不合法，请重新输入");
                continue;
            }

            if (check(numberStr)) {
                break;
            } else {
                System.out.println("输入的字符串包含非数字字符，请重新输入");
            }
        }

        String[] LuoMa = {"", "Ⅰ", "Ⅱ", "Ⅲ", "Ⅳ", "Ⅴ", "Ⅵ", "Ⅶ", "Ⅷ", "Ⅸ"};

        String numberLuoMa = getLuoMaCaes1(numberStr,LuoMa);
        System.out.println(numberLuoMa);

    }

    public static String getLuoMaCaes1(String str, String[] num){
        String numberStr = "";
        for (int i = 0; i < str.length(); i++) {
            numberStr = numberStr + num[str.charAt(i) - 48];
        }
        return numberStr;
    }

    public static String getLuoMaCaes2(String str, String[] num){
        String numberStr = "";
        for (int i = 0; i < str.length(); i++) {
            numberStr = numberStr + switch (str.charAt(i)){
                case '0' -> "";
                case '1' -> "Ⅰ";
                case '2' -> "Ⅱ";
                case '3' -> "Ⅲ";
                case '4' -> "Ⅳ";
                case '5' -> "Ⅴ";
                case '6' -> "Ⅵ";
                case '7' -> "Ⅶ";
                case '8' -> "Ⅷ";
                case '9' -> "Ⅸ";
                default -> "";
            };
        }

        return numberStr;

    }

    public static boolean check(String str){
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c < '0' || c > '9') {
                return false;
            }
        }

        return true;
    }
}
