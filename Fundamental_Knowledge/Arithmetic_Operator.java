package Fundamental_Knowledge;

public class Arithmetic_Operator {
    // 算数运算符
    public static void main(String[] args) {
        // 隐式转换（自动类型提升）：将变量从取值范围小的类型转换到取值范围大的类型，程序自动
        // 1.取值范围小类型的变量和取值范围大类型的变量做运算和赋值时，小范围变量会被提升为大范围变量后进行
        int a1 = 10;
        double a2 = a1;
        System.out.println(a2);

        int b1 = 10;
        double b2 = 20.34;
        double b3 = b1 + b2; // 变量类型取大范围的
        System.out.println(b3);
        // 2.byte, short, char类型变量参与运算时，会自动提升为int类型变量
        byte c1 = 10;
        byte c2 = 20;
        int c3 = c1 + c2;
        System.out.println(c3);
        // 强制转换：将变量从取值范围大的类型转换到取值范围小的类型，需额外代码
        // 目标类型 变量名 = (目标类型) 被强制转换变量
        double d1 = 12.3;
        int d2 = (int) d1;
        System.out.println(d2); // 数据可能发生错误：12.3变为12

        int e1 = 300;
        byte e2 = (byte) e1;
        System.out.println(e2); // 越界不会报错，但是数据将发生巨大偏差：300变为44

        byte f1 = 10;
        byte f2 = 20;
        byte f3 = (byte) (f1 + f2); // 注意代码计算顺序
        System.out.println(f3);
    }
}
