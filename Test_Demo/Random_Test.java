package Test_Demo;

import java.util.Random;
import java.util.Scanner;

// 输入一个上限数，在0-上限数之间生成一个随机数，并进行猜测

public class Random_Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Pls input the upper limit:");
        int limit = sc.nextInt();

        int correct = rand.nextInt(limit + 1);

        boolean flag = true;
        int count = 0;
        while (flag) {
            System.out.println("Pls input the number you guess:");
            int guess = sc.nextInt();
            if (guess > limit + 1)  {
                System.out.println("the number you guess is out of range.");
                continue;
            }
            if (correct == guess) {
                System.out.println("Good!You got it.");
                flag = false;
            } else if (correct > guess) {
                System.out.println("too small.");
                count++;
            } else {
                System.out.println("too big.");
            }
            count++;
        }
        System.out.println("You guess " + count +" times totally.");
    }
}
