package Fundamental_Knowledge;

public class Operator {
    // 运算符和变量组合形成表达式
    // 运算符包含：加减运算符、自增自减运算符、赋值运算符、关系运算符、逻辑运算符和三元运算符
    public static void main(String[] args){
        // 1.加减运算符和其它语言类似，/为取模，%为取余
        // 在计算中存在小数时，结果可能不精确（浮点数运算问题）
        System.out.println(1.1 + 1.01);
        System.out.println(1.1 * 1.01);
        System.out.println(5 / 4);// 整数运算只能取模
        System.out.println(5.0 / 4); // 小数参与运算好将得到精确值
        System.out.println(10 % 6);
    }
}
