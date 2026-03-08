public class Test08 {
    public static void main(String[] args) {
        /*
        身份信息查看
         */

        String identity = "320804200206275115";

        String year = identity.substring(6,10);
        String month = identity.substring(10,12);
        String day = identity.substring(12,14);

        System.out.println("出生年月日为:" + year + "年" + month + "月" + day + "日");

        String sex = identity.substring(17,18);

        int number = sex.charAt(0) - 48;

        if (number % 2 == 0) {
            System.out.println("性别为女");
        } else {
            System.out.println("性别为男");
        }
    }
}
