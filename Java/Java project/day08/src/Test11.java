public class Test11 {
    public static void main(String[] args) {
        /*
        调整字符串
            给定两个字符串,A 和 B
            A 的旋转操作就是将 A最左边的字符移动到最右边。
            例如,若 A='abcde'，在移动一次之后结果就是'bcdea'
            如果在若干次调整操作之后，A能变成B，那么返回True。
            如果不能匹配成功，则返回false
         */

        String strA = "abcde";
        String strB = "bcdea";

        System.out.println(checkCase1(strA, strB));

        String tempStr = strA;

        boolean bool = false;

        for (int i = 0; i < strB.length(); i++) {
            if (strB.equals(tempStr)) {
                bool = true;
                break;
            }
            tempStr = checkCase2(tempStr);
        }
        System.out.println(bool);

    }

    public static boolean checkCase1(String strA, String strB){
        for (int i = 0; i < strA.length(); i++) {
            String str1 = strA.substring(0,1);
            String str2 = strA.substring(1);
            String newStr = str2 + str1;

            if (newStr.equals(strB)) {
                return true;
            }
        }
        return false;
    }

    public static String checkCase2(String strA){
        char[] arr = strA.toCharArray();

        char c = arr[0];

        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr [i];
        }

        arr[arr.length - 1] = c;

        String str = "";

        for (int i = 0; i < arr.length; i++) {
            str = str + arr[i];
        }

        return str;
    }
}
