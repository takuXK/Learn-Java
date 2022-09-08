package Test_Demo;

import java.util.Scanner;

// 在不使用乘法、除法和取余运算符的条件下求解被除数 / 除数得到的商和余数

public class Divide_Mod_Method {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pls input an integer as a divided number: ");
        int divided_num = sc.nextInt();
        System.out.println("Pls input an integer as a divide number: ");
        int divide_num = sc.nextInt();

        int stack_num = 0;
        int stack_count = 0;
        // 也可考虑递减的方法，和divide_num比较，逻辑更简单些，余数不需要再定义变量(mod)算一次
        while (stack_num < (divided_num - divide_num)) {
            stack_num += divide_num;
            stack_count++;
        }
        int mod = divided_num - stack_num;
        System.out.println("the quotient is: " + stack_count);
        System.out.println("the reminder is: " + mod);
    }
}
