import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        /*
        已知正确的用户名和密码，请用程序实现模拟用户登录，
        总共给三次机会，登录之后，给出相应的提示
         */

        String userName = "cyh";
        String password = "123456789";

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("请输入用户名");
            String userStr = sc.next();
            System.out.println("请输入密码");
            String passwordStr = sc.next();

            if (userStr.equals(userName) && password.equals(passwordStr)) {
                System.out.println("登陆成功");
                break;
            } else {
                if (i == 2) {
                    System.out.println("账号已被锁定");
                }else {
                    System.out.println("登录失败，用户名或密码错误");
                }
            }
        }
    }
}
