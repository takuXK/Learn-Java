package Array;

public class Array_Fundamental {
    public static void main(String[] args) {
        // 数组可以用来记录多个同类型数据
        // 数组的定义格式：
        // 1.数据类型[] 数组名
        // 2.数据类型 数组名[]

        // 数组需要初始化(赋值)：
        // 数组的初始化分为静态初始化和动态初始化
        // 静态初始化格式：数据类型[] 数组名 = new 数据类型[] {元素1, 元素2, 元素3, ...};
        // 上述格式中new直到{}前面的都可以省略
        // 动态初始化格式：数据类型[] 数组名 = new 数据类型[数组长度]

        // 上述两个过程最终将得到一个数组
        int[] array = new int[] {11, 22, 33};
        double[] array2 = {11.1, 22.2, 33.3};
        System.out.println(array); // 此时输出的是数组存储的地址
        int[] array3 = new int[3];
        // 动态初始化中，默认初始值为0(0.0)，字符类型为'/u0000'(空格)，布尔类型为false，字符串类为null
        System.out.println(array3[1]);
        // 数组元素的访问
        // 格式：数组名[索引](索引从0开始)
        System.out.println(array2[1]);
        array2[2] = array[2];  // 这里存在一个隐式转换
        System.out.println(array2[2]);
    }
}
