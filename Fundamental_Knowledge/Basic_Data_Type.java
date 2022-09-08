package Fundamental_Knowledge;

public class Basic_Data_Type {
    // java中的数据类型分为基本数据类型和引用数据类型，这里阐述基本数据类型
    public static void main(String[] args){
        // 基本数据类型分为整数、浮点数、字符和布尔四大类型
        // 整数类型包含byte, short, int, double四类
        byte b = 10; // byte类型变量可以存储-128~127范围内的任意整数
        System.out.println(b);

        short s = 999; // short
        System.out.println(s);

        int i = 2178; // int
        System.out.println(i);

        long n = 38729018239321L; // long类型变量需要在值后加上 L 或 l
        System.out.println(n);

        // 浮点数类型包含float, double两类
        float f = 12.25F; // float类型变量需要在值后加上 F 或 f
        System.out.println(f);

        double d = 466.545;
        System.out.println(d);

        // 字符类型
        char c = '中';
        System.out.println(c);

        // 布尔类型
        boolean o = true;
        System.out.println(o);
    }
}
