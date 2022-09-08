package Test_Demo;

import java.util.Random;

// 生成10个1-100范围内的随机数：求和，取平均，统计小于平均值的数个数

public class Array_Traverse_Statistic {
    public static void main(String[] args) {
        Random rand = new Random();

        int[] array_prod = new int[10];
        for (int i = 0; i < array_prod.length; i++) {
            array_prod[i] = rand.nextInt(100) + 1;
        }

        // 求和
        int sum = 0;
        for (int j = 0; j < array_prod.length; j++) {
            sum += array_prod[j];
        }
        System.out.println("the sum of array is: " + sum);
        // 取平均
        double ave = (double) sum / (double) array_prod.length;
        System.out.println("the average of array is: " + ave);
        // 统计小于平均值的数据
        int count = 0;
        for (int k = 0; k < array_prod.length; k++) {
            if (ave > array_prod[k]) {
                count++;
            } else {
                continue;
            }
        }
        if (count == 1) {
            System.out.println("there is one number that is smaller than average.");
        } else {
            System.out.println("there are " + count + " of number that is smaller than average.");
        }
    }
}
