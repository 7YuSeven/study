public class Test09 {
    public static void main(String[] args) {
        /*
        敏感词替换
         */
        String str = "acndamsda, abc";

        String newStr = str.replace("abc", "***");

        System.out.println(newStr);
    }
}
