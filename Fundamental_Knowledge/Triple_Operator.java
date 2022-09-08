package Fundamental_Knowledge;

public class Triple_Operator {
    public static void main(String[] args) {
        // 三元运算符：运行一个判断语句，如结果为true，运行前一行；结果为false，运行后一行，可代替if else语句
        // 格式：关系表达式? 表达式1: 表达式2
        // e.g. 求两个数中的最大值
        int a = 10;
        int b = 20;
        int max = (a > b)? a: b;
        System.out.println(max);
        // 三元运算符的嵌套
        int c = 30;
        int m = ((a > b)? a: b) > c? ((a > b)? a: b): c;
        System.out.println(m);
    }
}
