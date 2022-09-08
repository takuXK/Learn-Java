package Code_Structure;

import java.util.Scanner;

public class Structure_If {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pls input an integer:");
        int w = sc.nextInt();
        // if语句格式：

        // if (关系表达式) {
        //    语句体;
        // }
        if (w > 10) {
            System.out.println("Good!"); // 如果if中语句体只有一行，可省略大括号
        }
        // if (关系表达式) {
        //    语句体1;
        // } else {
        //    语句体2;
        // }
        if (w >= 10) {
            System.out.println("Good!");
        } else {
            System.out.println("Unfortunate.");
        }
        // if (关系表达式) {
        //    语句体1;
        // } else if {
        //    语句体2;
        // }
        // ...
        // else {
        //    语句体n;
        // }
        System.out.println("Pls input the score you got:");
        int score = sc.nextInt();
        if (score <= 100 & score >= 0){
            if (score >= 90) {
                System.out.println("Good!");
            } else if (score < 90 & score >= 80) {
                System.out.println("Fine!");
            } else if (score < 80 & score >= 70) {
                System.out.println("Common.");
            } else if (score < 70 & score >= 60) {
                System.out.println("Qualified.");
            } else {
                System.out.println("Unqualified.");
            }
        } else {
            System.out.println("Score must <= 100 and >= 0");
        }
    }
}
