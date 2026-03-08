package com.studengupsystem;

import com.studentsystem.StudentSystem;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        ArrayList<User> userArrayList = new ArrayList<>();
        while (true) {
            System.out.println("欢迎来到学生管理系统");
            System.out.println("请选择操作1.登录 2.注册 3.忘记密码 4.退出");
            String choose;
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入您的选择");
            choose = sc.next();

            switch (choose) {
                case "1" -> login(userArrayList);
                case "2" -> register(userArrayList);
                case "3" -> forgetPassword(userArrayList);
                case "4" -> System.exit(0);
            }
        }
    }

    //登录
    public static void login(ArrayList<User> userArrayList) {
        Scanner sc = new Scanner(System.in);
        int count = 1;

        while (true) {
            String code = getCode();
            System.out.println("请输入用户名");
            String username = sc.next();

            System.out.println("请输入密码");
            String password = sc.next();

            System.out.println("请输入右侧的验证码: " + code);
            String newCode = sc.next();

            if (!checkUsername(userArrayList, username)) {
                System.out.println("用户名未注册，请先注册");
                return;
            }

            if (checkPassword(userArrayList, password) && newCode.equals(code)) {
                System.out.println("登录成功");
                StudentSystem studentSystem = new StudentSystem();
                studentSystem.StudengSystem();
                break;
            }
            if (!newCode.equals(code)) {
                System.out.println("验证码错误，请重新输入");
                continue;
            }

            if (!checkPassword(userArrayList, password)) {
                if (count == 3) {
                    System.out.println("密码错误次数过多，退出");
                    return;
                } else {
                    System.out.println("密码错误,还剩" + (3 - count) + "次机会");
                    count++;
                }
            }
        }
    }

    //注册
    public static void register(ArrayList<User> userArrayList) {
        Scanner sc = new Scanner(System.in);

        String username;
        while (true) {
            System.out.println("请输入用户名");
            username = sc.next();

            if (username.length() < 3 || username.length() > 15) {
                System.out.println("用户名长度不足或过长，请重新输入");
            } else if (checkUsername(userArrayList, username)) {
                System.out.println("用户名重复，请重新输入");
            } else if (checkUsernameForm(username)) {
                System.out.println("用户名中存在非法字符，请重新输入");
            } else if (checkUsernameNum(username)) {
                System.out.println("用户名不能全为数字，请重新输入");
            } else {
                break;
            }
        }

        String password;
        while (true) {
            System.out.println("请输入密码");
            password = sc.next();

            System.out.println("请再次输入密码");
            String nextPassword = sc.next();

            if (password.equals(nextPassword)) {
                break;
            } else {
                System.out.println("请重新输入");
            }
        }

        String id;
        while (true) {
            System.out.println("请输入身份证");
            id = sc.next();
            if (id.length() != 18) {
                System.out.println("身份证长度不合法，请重新输入");
            } else if (id.charAt(0) == '0') {
                System.out.println("身份证首位不能为0");
            } else if ((id.charAt(id.length() - 1) != 'x' && id.charAt(id.length() - 1) != 'X') &&
                    (id.charAt(id.length() - 1) < '0' || id.charAt(id.length() - 1) > '9')) {
                System.out.println("身份证最后一位错误，请重新输入");
            } else if (checkId(id)) {
                System.out.println("身份证含非法字符，请重新输入");
            } else {
                break;
            }
        }

        String phone;
        while (true) {
            System.out.println("请输入手机号");
            phone = sc.next();

            if (phone.length() != 11) {
                System.out.println("手机号长度过长或过短，请重新输入");
            } else if (phone.charAt(0) == '0') {
                System.out.println("手机号首位不能为0");
            } else if (checkPhone(phone)) {
                System.out.println("手机号含非法字符，请重新输入");
            } else {
                break;
            }
        }

        User user = new User(username, password, id, phone);

        userArrayList.add(user);
        System.out.println("注册成功");
    }

    //忘记密码
    public static void forgetPassword(ArrayList<User> userArrayList) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入用户名");
        String username = sc.next();

        int index = getIndex(userArrayList, username);

        if (index == -1) {
            System.out.println("未注册");
            return;
        }

        System.out.println("请输入身份证号");
        String id = sc.next();

        System.out.println("请输入手机号");
        String phone = sc.next();

        if (userArrayList.get(index).getId().equals(id) && userArrayList.get(index).getPhone().equals(phone)) {
            System.out.println("请输入密码");
            String password = sc.next();
            userArrayList.get(index).setPassword(password);
        } else {
            System.out.println("账号信息不匹配，修改失败");
            return;
        }
        System.out.println("修改成功");
    }

    //获取用户名所在的索引
    public static int getIndex(ArrayList<User> userArrayList, String username) {
        for (int i = 0; i < userArrayList.size(); i++) {
            User user = userArrayList.get(i);
            if (user.getUsername().equals(username)) {
                return i;
            }
        }

        return -1;
    }

    //验证用户名是否唯一
    public static boolean checkUsername(ArrayList<User> userArrayList, String userName) {
        for (int i = 0; i < userArrayList.size(); i++) {
            User user = userArrayList.get(i);
            if (user.getUsername().equals(userName)) {
                return true;
            }
        }

        return false;
    }

    //判断密码是否正确
    public static boolean checkPassword(ArrayList<User> userArrayList, String password) {
        for (int i = 0; i < userArrayList.size(); i++) {
            User user = userArrayList.get(i);
            if (user.getPassword().equals(password)) {
                return true;
            }
        }

        return false;
    }

    //检查用户名是否为字母和数字组合
    public static boolean checkUsernameForm(String username) {
        for (int i = 0; i < username.length(); i++) {
            char c = username.charAt(i);
            if (!(c >= 'a' && c <= 'z') && !(c >= 'A' && c <= 'Z') && !(c >= '0' && c <= '9')) {
                return true;
            }
        }

        return false;
    }

    //检查用户名是否为纯数字
    public static boolean checkUsernameNum(String username) {
        int count = 0;

        for (int i = 0; i < username.length(); i++) {
            char c = username.charAt(i);
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                count++;
            }
        }

        if (count == 0) {
            return true;
        }
        return false;
    }

    //检查身份证前17是否为数字
    public static boolean checkId(String id) {
        for (int i = 0; i < id.length() - 1; i++) {
            if (id.charAt(i) < '0' || id.charAt(i) > '9') {
                return true;
            }
        }

        return false;
    }

    //检查手机号是否全为数字
    public static boolean checkPhone(String phone) {
        for (int i = 0; i < phone.length(); i++) {
            if (phone.charAt(i) < '0' || phone.charAt(i) > '9') {
                return true;
            }
        }

        return false;
    }

    //生成验证码
    public static String getCode() {
        char[] c = new char[52];

        for (int i = 0; i < c.length; i++) {
            if (i < 26) {
                c[i] = (char) (97 + i);
            } else {
                c[i] = (char) (65 + i - 26);
            }
        }

        Random r = new Random();

        String code = "";

        for (int i = 0; i < 4; i++) {
            int index = r.nextInt(52);
            code = code + c[index];
        }

        int index = r.nextInt(10);
        code = code + index;

        char[] arr = code.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            int newIndex = r.nextInt(code.length());
            char temp = arr[newIndex];
            arr[newIndex] = arr[i];
            arr[i] = temp;
        }

        return new String(arr);
    }

}
