package Test_Demo;

import java.util.Scanner;

// 输入一个三位数，分别输出百位、十位和个位

public class Num_Partial {
    public static void main(String[] args) {
        // input
        Scanner sc = new Scanner(System.in);
        System.out.println("Pls input an integer between 100 to 999.");
        int num = sc.nextInt();
        // partial
        int hud = num / 100 % 10; //百位数
        int td = num / 10 % 10; // 十位数
        int sd = num % 10; // 个位数
        // output
        System.out.println("the hundreds digit is: " + hud);
        System.out.println("the ten digit is: "+ td);
        System.out.println("the single digit is: " + sd);
    }
}
