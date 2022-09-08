package Fundamental_Knowledge;

public class Variable {
    // 变量定义方法：数据类型 变量名 = 数据值;
    public static void main(String[] args){
        System.out.println("abc");
        int a = 10; // 变量使用前一定需要赋值
        /* 另一种变量定义方法，但不建议
        *int g;
        * g = 100; */
        // int a = 10; // 变量再次定义相同值会报错
        System.out.println(a);
        a = 50;  // 改变先前定义过的变量值时，不再需要写数据类型，否则会被认为是重复定义
        int b = 20;
        System.out.println(a + b);
        // 可同时定义多个同类型变量
        int c = 5, d = 6;
        System.out.println(c);
        System.out.println(d);
        //不同类型的多个变量需分开定义
        /* int e = 10, double f = 1.22;
        System.out.println(e + f); */
    }
}
