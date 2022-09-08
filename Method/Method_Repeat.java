package Method;

public class Method_Repeat {
    public static void main(String[] args) {
        System.out.println(sum(10, 20));
        System.out.println(sum(10, 20, 30));
        System.out.println(sum(10.1, 20.3));
    }
    // 方法名相同，但是输入参数不同（个数、类型、顺序满足其一即可）的方法互为重载方法，这些方法往往具有类似的功能
    // 一下三个类互相构成重载关系
    public static int sum(int num1, int num2) {
        return num1 + num2;
    }

    public static int sum(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public static double sum(double num1, double num2) {
        return num1 + num2;
    }
}
