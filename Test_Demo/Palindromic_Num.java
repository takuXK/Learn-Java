package Test_Demo;

import java.util.Scanner;

// 验证输入数字是回文数：正序和倒序是同一个数的整数
// 核心思路：把数字倒过来和原数字比较

public class Palindromic_Num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pls input an integer that need to be verified:");
        int input_num = sc.nextInt();

        int verify_num = input_num;
        int palindromic_num = 0;
        while (verify_num != 0) {
            int get_num = verify_num % 10;
            verify_num /= 10;
            palindromic_num = palindromic_num * 10 + get_num;
        }
        // System.out.println(palindromic_num);
        if (palindromic_num == input_num) {
            System.out.println("number " + input_num + " is a palindromic number.");
        } else {
            System.out.println("number " + input_num + " is not a palindromic number.");
        }
    }
}
