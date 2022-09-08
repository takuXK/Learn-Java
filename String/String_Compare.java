package String;

import java.util.Scanner;

public class String_Compare {
    public static void main(String[] args) {
        // 字符串是引用数据类型，存储在堆中，如果使用 == 进行比较，并不能比较字符串本身的内容
        // 存在两个方法可以直接比较两个字符串本身的内容:
        // 1.equals方法将以区分大小写的形式比较字符串
        // 2.equalsIgnoreCase将以不区分大小写的形式比较字符串
        String s1 = "abc";
        String s2 = new String("Abc");

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));

        // 通过scanner输入得到的字符串是new关键字构造出来的
        Scanner sc = new Scanner(System.in);
        String s3 = sc.next();
        System.out.println(s1 == s3);
        System.out.println(s3.equalsIgnoreCase(s1));
    }
}
