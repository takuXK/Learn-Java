package Test_Demo;

import java.util.Random;

// 给定一个数组，随机打乱其中的顺序

public class Array_Upset {
    public static void main(String[] args) {
        int[] target_array = {1,2,3,4,5,6,7,8,9,10};

        Random rand = new Random();

        for (int i = 0; i < target_array.length; i++) {
            int rand_index = rand.nextInt(target_array.length);
            int temp = target_array[i];
            target_array[i] = target_array[rand_index];
            target_array[rand_index] = temp;
        }

        for (int j = 0; j < target_array.length; j++) {
            System.out.println(target_array[j] + " ");
        }
    }
}
