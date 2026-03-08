import java.util.StringJoiner;

public class Test04 {
    public static void main(String[] args) {
        /*
        拼接字符串
            定义一个方法，把 int数组中的数据按照指定的格式拼接成一个字符串返回
            调用该方法，并在控制台输出结果。
            例如:
            数组为 int] arr ={1,2,3};
            执行方法后的输出结果为:[1，2, 3]
         */

        int[] arr = {1,2,3};

        String str1 = getStringCase1(arr);
        String str2 = getStringCase2(arr);
        String str3 = getStringCase3(arr);

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);

        /*
        对称字符串
         */
        String string = "abc";

        StringBuilder sb = new StringBuilder();
        sb.append(string);
        String newStr = sb.reverse().toString();
        System.out.println(newStr);

    }

    public static String getStringCase3(int[] arr){
        StringJoiner sj = new StringJoiner(", ", "[", "]");
        for (int i = 0; i < arr.length; i++) {
            sj.add(arr[i] + "");
        }

        return sj.toString();
    }

    public static String getStringCase2(int[] arr){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length - 1; i++) {
            sb.append(arr[i]).append(", ");
        }
        sb.append(arr[arr.length - 1] + "]");

        return sb.toString();
    }

    public static String getStringCase1(int[] arr){
        String str = "[";

        for (int i = 0; i < arr.length - 1; i++) {
            str = str + arr[i] + ", ";
        }

        str = str + arr[arr.length - 1] + "]";

        return str;
    }
}
