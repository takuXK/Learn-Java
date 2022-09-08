package Test_Demo;

import java.util.Scanner;

// 输入一个数，求1至该数求累加和，以及求1至该数间所有偶数的累加和

public class Continue_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pls input an integer ending the sum calculation process:");
        int end_num = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= end_num; i++) { // IDEA中可使用循环次数.for变量自动生成循环
            sum += i;
        }
        System.out.println("The sum of " + end_num + " is: " + sum);
        int sum_even = 0;
        for (int j = 1; j <= end_num; j++) {
            if (j % 2 == 0) {
                sum_even += j;
            } else {
                continue;
            }
        }
        System.out.println("The even sum of " + end_num + " is: " + sum_even);
    }
}
