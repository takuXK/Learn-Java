package Test_Demo;

import java.util.Scanner;

// 输入上界和下界，统计范围中既能被3整除又能被5整除的数的个数

public class Statistic_For {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pls input an integer as floor:");
        int floor_num = sc.nextInt();
        System.out.println("Pls input an integer as ceil:");
        int ceil_num = sc.nextInt();
        int count = 0;
        for (int i = floor_num; i <= ceil_num; i++){
            if (i % 3 == 0 && i % 5 == 0){
                count++;
            } else {
                continue;
            }
        }
        System.out.println("[" + floor_num + ", " + ceil_num + "]" + " has " + count + " number that can be divided either 3 or 5.");
    }
}
