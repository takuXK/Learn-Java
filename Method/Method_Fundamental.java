package Method;

public class Method_Fundamental {
    // 方法：程序中最小执行单元，用于封装需要重复用到的代码
    // public static void main(String[] args)为主方法
    // 方法的定义：
    /*public static 返回值类型 方法名(参数){
        方法代码;
        return 返回值
    }*/
    public static void main(String[] args) {
        HelloWorld(); // 无返回值无参数方法调用
        int num1 = 30;
        int num2 = 20;
        GetSum(num1, num2); // 无返回值方法调用
        GetSum(num1=10, num2=20);
        // 存在返回值的方法有两种调用手段
        // 1.赋值调用，将返回值赋值给一个变量
        int result1 = Multiply(10, 20);
        GetSum(result1, 20);
        // 2.直接调用，返回值也可无视
        System.out.println(Multiply(10, 20));
    }
    // 无返回值无参数方法定义
    public static void HelloWorld() {
        System.out.println("Hello World!");
    }
    // 无返回值方法定义
    public static void GetSum(int num1, int num2) {
        int result = num1 + num2;
        System.out.println("the sum of " + num1 + " and " + num2 + " is " + result);
    }
    // 当某方法需要调用其它方法的结果时，则需定义返回值和注意返回类型，如果返回的是数组，则在数据类型后加[]
    public static int Multiply(int num1, int num2) {
        int result = num1 * num2;
        return result;
    }
}
