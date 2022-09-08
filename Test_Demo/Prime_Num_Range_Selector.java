package Test_Demo;

import java.util.Scanner;

//录入一个整数范围，寻找该范围内的所有质数

public class Prime_Num_Range_Selector {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pls input the lower limit: ");
        int lower_limit = sc.nextInt();
        System.out.println("Pls input the upper limit: ");
        int upper_limit = sc.nextInt();
        int quan = Statistic(lower_limit, upper_limit);
        System.out.println("the amount of prime number between range [" + lower_limit + ", " + upper_limit + ") is " + quan);
    }
    // 定义一个方法，判断单个数是否为质数
    public static boolean Judgement(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    // 定义一个方法，统计特定范围内质数个数
    public static int Statistic(int lower, int upper) {
        int count = 0;
        for (int num = lower; num < upper; num++) {
            boolean isprime = Judgement(num);
            if (isprime) {
                count++;
            }
        }
        return count;
    }
}
