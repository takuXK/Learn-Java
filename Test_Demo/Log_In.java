package Test_Demo;

import java.util.Scanner;

// 模拟用户登录系统

public class Log_In {
    public static void main(String[] args) {
        String username_right = "zhangsan";
        String password_right = "123456";

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("Pls input username: ");
            String username_input = sc.next();
            System.out.println("Pls input password: ");
            String password_input = sc.next();
            if (username_input.equals(username_right) && password_input.equals(password_right)) {
                System.out.println("Succeeded to log in.");
                break;
            } else {
                if (i == 2) {
                    System.out.println("Your account is locked.");
                } else {
                    System.out.println("Failed to log in, Pls check your username and password.");
                    System.out.println("You remain " + (2 - i) + " chance to log in.");
                }
            }
        }
    }
}
