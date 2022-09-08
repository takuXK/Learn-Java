package Test_Demo;

import java.util.Scanner;
import java.util.StringJoiner;

// 输入一个字符串，字符串内只能包含0-9，且长度不超过9，将其转换为对应的罗马数字

public class Change_to_RomanNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = new String();
        while (true) {
            System.out.println("Pls input a string: ");
            str = sc.next();
            boolean flag1 = CheckStringLength(str);
            boolean flag2 = CheckStringText(str);
            if (!flag1) {
                System.out.println("The length of string is out of range. Pls input a string again.");
                continue;
            }
            if (!flag2) {
                System.out.println("There is illegal character in the string. Pls input a string again.");
                continue;
            }
            if (flag1 && flag2) {
                break;
            }
        }
        // 无需间隔符使用StringBuilder即可
        StringJoiner sj = new StringJoiner(" ");
        for (int i = 0; i < str.length(); i++) {
            String roman = RomanNum(str.charAt(i));
            sj.add(roman);
        }
        String result = sj.toString();
        System.out.println(result);
    }
    // 定义一个方法，确认字符串长度小于等于9
    public static boolean CheckStringLength(String str) {
        int len = str.length();
        return len <= 9 ? true: false;
    }
    // 定义一个方法，确认字符串内容只包含0-9
    public static boolean CheckStringText(String str) {
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c < '0' || c > '9') {
                return false;
            }
        }
        return true;
    }
    // 定义一个方法，将数字和罗马数字对应起来
    public static String RomanNum(char num) {
        String[] roman_num = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        int index = num - '0';
        return roman_num[index];
    }
}