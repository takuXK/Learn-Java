package Fundamental_Knowledge;

public class Self_Operator {
    public static void main(String[] args) {
        // 自增自减运算符：++和--
        int a = 10;
        a++;
        System.out.println(a);
        ++a; // 先++和后++单独写是没区别的
        System.out.println(a);
        a--;
        System.out.println(a);
        --a;
        System.out.println(a);
        System.out.println("-------------------");
        // 但是和其它运算符一起写的时候，先++和后++有区别
        a = 10;
        int b = a++; // 先赋值后加
        System.out.println(a);
        System.out.println(b);
        a = 10;
        int c = ++a; // 先加后赋值
        System.out.println(a);
        System.out.println(c);
    }
}
