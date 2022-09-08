package Fundamental_Knowledge;// 通过键盘输入实现与外界的交互
// 本质上为扩展包Scanner的用法

import java.util.Scanner; // 需预先导入

public class Keyboard_Input {
    // 通过键盘输入两个整数，并输出他们的和
    public static void main(String[] args){
        // 创建对象，类初始化
        Scanner sc = new Scanner(System.in);
        System.out.println("Pls input the first integer through keyboard.");
        // 提示键盘输入，并存入变量中
        int num1 = sc.nextInt(); // 此时nextInt是输入整数，其它数据类型有其它命令
        System.out.println("Pls input the second integer through keyboard.");
        int num2 = sc.nextInt(); // 第二次输入不需要再次初始化导入类

        System.out.println("the sum of 2 integers is:");
        System.out.println(num1 + num2);
    }
}
