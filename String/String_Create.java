package String;

public class String_Create {
    public static void main(String[] args) {
        // 字符串的创建方法
        // 1.直接赋值创建
        // 需要注意到是，对于直接赋值定义的字符串，两个内容相同的字符串将指向同一个地址
        String s1 = "abc";
        System.out.println(s1);

        // 2.空参构造
        String s2 = new String();
        System.out.println("a" + s2 + "c");

        // 3.传递一个字符数组
        char[] chs = {'a', 'b', 'c', 'd'};
        String s3 = new String(chs);
        System.out.println(s3);

        // 4.传递一个字节(byte)数组，此时将按照ASCII码输出
        byte[] bytes = {97, 98, 99, 100};
        String s4 = new String(bytes);
        System.out.println(s4);
    }
}
