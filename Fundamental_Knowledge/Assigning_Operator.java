package Fundamental_Knowledge;

public class Assigning_Operator {
    public static void main(String[] args) {
        // 赋值运算符
        // a += b,等价于 a = a + b
        int a1 = 10;
        int a2 = 20;
        a2 += a1;
        System.out.println(a2);
        // 类似的还包括：a -= b, a *= b, a/= b, a %= b
        // 上述赋值运算符含有强制类型转换代码：
        short b = 1;
        b += 1; // 如果此时b = b + 1的话，b + 1的结果应该是int类型，而b本身是short类型，int类型赋值给short类型需要强制类型转换
        // 上述代码等同于 b = (short) (b + 1)
        System.out.println(b);
    }
}
