package Fundamental_Knowledge;

public class Logic_Operator {
    public static void main(String[] args) {
        // 逻辑运算符包含：&与，|或，^异或，!非
        System.out.println(true & true);
        System.out.println(true & false);

        System.out.println(true | false);
        System.out.println(false | false);

        System.out.println(true ^ false);
        System.out.println(true ^ true);

        System.out.println(!true);
        System.out.println(!false);
        // 短路逻辑运算符：用于存在大于等于两个判断语句并且存在先后关系的情况
        // e.g. 输入用户名和密码，当用户名正确时才需要继续判断密码的正确性，否则直接结束整个判断
        // 短路逻辑运算符包括：&&和，||或，运行结果和&以及|一样，但可节省运行资源
        System.out.println(true && false);
        System.out.println(true || false);

        // 短路效果可由以下代码中变量b的值体现，在以下代码中，变量b未自增
        int a = 10;
        int b = 10;
        boolean r = ++a < 5 && ++b < 5;
        System.out.println(r);
        System.out.println(a);
        System.out.println(b); // b仍然是10，也就是说++b < 5这条语句是未运行过的
    }
}
