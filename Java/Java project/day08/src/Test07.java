public class Test07 {
    public static void main(String[] args) {
        /*
        手机号屏蔽
         */
        String phone = "12345678912";

        String start = phone.substring(0,3);
        String end = phone.substring(7);

        String newPhone = start + "****" + end;

        System.out.println(newPhone);
    }
}
