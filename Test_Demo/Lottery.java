package Test_Demo;

import java.util.Random;
import java.util.Scanner;

// 双色球抽奖模拟系统，判断得到的奖

public class Lottery {
    public static void main(String[] args) {
        int[] prize = PrizeNumbers(6, 1, 33, 16);
        int[] customer = CustomerNumber(6, 1, 33, 16);
        int[] result = PrizeStatistic(prize, customer, 6, 1);
        PrizeInfo(result, prize, customer);
    }
    // 定义一个方法，针对中奖情况返回相应的信息
    public static void PrizeInfo(int[] result, int[] prize, int[] customer) {
        System.out.print("The prize numbers are: ");
        Output(prize);
        System.out.println();
        System.out.print("The chose numbers are: ");
        Output(customer);
        System.out.println();
        System.out.println("You have " + result[0] + " red ball(s) matches to prize number!");
        System.out.println("You have " + result[1] + " blue ball(s) matches to prize number!");
    }
    // 定义一个方法，核对中奖号码和用户选择的号码，并针对正确的值进行统计
    public static int[] PrizeStatistic(int[] prize, int[] customer, int count_red, int count_blue) {
        int correct_red = 0;
        int correct_blue = 0;
        int[] prize_red = Split(prize, 0, count_red);
        int[] prize_blue = Split(prize, count_red, count_red + count_blue);
        int[] customer_red = Split(customer, 0, count_red);
        int[] customer_blue = Split(customer, count_red, count_red + count_blue);
        for (int i = 0; i < customer_red.length; i++) {
            boolean flag_red = IsExist(prize_red, customer_red[i]);
            if (flag_red) {
                correct_red++;
            }
        }
        for (int j = 0; j < customer_blue.length; j++) {
            boolean flag_blue = IsExist(prize_blue, customer_blue[j]);
            if (flag_blue) {
                correct_blue++;
            }
        }
        return new int[]{correct_red, correct_blue};
    }
    // 定义一个方法，生成一个多位位数组，代表奖的号码
    public static int[] PrizeNumbers(int count_red, int count_blue, int num_red, int num_blue) {
        Random rand = new Random();
        int[] prize_red = new int[count_red];
        int[] prize_blue = new int[count_blue];
        // prize number of red balls
        for (int i = 0; i < count_red; ) {
            int index_red = rand.nextInt(num_red) + 1;
            boolean flag_red = IsExist(prize_red, index_red);
            if (! flag_red) {
                prize_red[i] = index_red;
                i++;
            } else {
                continue;
            }
        }
        // prize number of blue balls
        for (int j = 0; j < count_blue; ) {
            int index_blue = rand.nextInt(num_blue) + 1;
            boolean flag_blue = IsExist(prize_blue, index_blue);
            if (! flag_blue) {
                prize_blue[j] = index_blue;
                j++;
            } else {
                continue;
            }
        }
        int[] prize_numbers = Joint(prize_red, prize_blue);
        return prize_numbers;
    }
    // 定义一个方法，根据用户的输入生成一个多位数组，代表抽奖号码
    public static int[] CustomerNumber(int count_red, int count_blue, int num_red, int num_blue) {
        Scanner sc =new Scanner(System.in);
        int[] customer_red = new int[count_red];
        int[] customer_blue = new int[count_blue];
        // customer number of red balls
        for (int i = 0; i < count_red; ) {
            System.out.println("Pls input a number in the range of [1, " + num_red + "] for red ball: ");
            int input_red = sc.nextInt();
            if (input_red >= 1 & input_red <= num_red) {
                boolean flag_red = IsExist(customer_red, input_red);
                if (! flag_red) {
                    customer_red[i] = input_red;
                    i++;
                } else {
                    System.out.println("You have chose a repeated number!");
                    continue;
                }
            } else {
                System.out.println("The number you input is out of range!");
                continue;
            }
        }
        // customer number for blue balls
        for (int j = 0; j < count_blue; ) {
            System.out.println("Pls input a number in the range of [1, " + num_blue + "] for blue ball: ");
            int input_blue = sc.nextInt();
            if (input_blue >= 1 & input_blue <= num_blue) {
                boolean flag_blue = IsExist(customer_blue, input_blue);
                if (! flag_blue) {
                    customer_blue[j] = input_blue;
                    j++;
                } else {
                    System.out.println("You have chose a repeated number!");
                    continue;
                }
            } else {
                System.out.println("The number you input is out of range!");
                continue;
            }
        }
        int[] customer_numbers = Joint(customer_red, customer_blue);
        return customer_numbers;
    }
    // 定义一个方法，判断数字在数组中是否存在，和奖生成、抽奖方法配套使用以防止出现重复号码
    public static boolean IsExist(int[] array, int num) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) {
                return true;
            }
        }
        return false;
    }
    // 定义一个方法，拼接两个数组
    public static int[] Joint(int[] array1, int[] array2) {
        int[] jointed_array = new int[array1.length + array2.length];
        for (int i = 0; i < array1.length; i++) {
            jointed_array[i] = array1[i];
        }
        for (int j = 0; j < array2.length; j++) {
            jointed_array[array1.length + j] = array2[j];
        }
        return jointed_array;
    }
    // 定义一个方法，按照指定索引拆分数组
    public static int[] Split(int[] array, int start, int end) {
        if (start < end){
            int[] result = new int[end - start];
            for (int i = start; i < end; i++) {
                result[i - start] = array[i];
            }
            return result;
        } else {
            System.out.println("Param 'start' must less than 'end'.");
            return array;
        }
    }
    // 定义一个方法，该方法可以打印数组
    public static void Output(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
