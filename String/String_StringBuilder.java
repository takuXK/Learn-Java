package String;

public class String_StringBuilder {
    public static void main(String[] args) {
        // StringBuilder：一个内容可变的字符串容器，提高字符串操作效率
        // 在拼接字符串时，如果拼接操作次数过多，会导致程序运行慢，此时可以使用StringBuilder来实现
        // StringBuilder对象生成
        StringBuilder sb1 = new StringBuilder(); // 空参构造
        StringBuilder sb2 = new StringBuilder("abc"); // 有参构造
        // StringBuilder下的方法
        // append用于在容器中添加内容
        sb1.append(1);
        sb1.append(2.3);
        sb1.append(true);
        System.out.println(sb1);
        // reverse用于反转容器中的内容
        sb1.reverse();
        System.out.println(sb1);
        // length返回容器中字符长度
        int len = sb1.length();
        System.out.println(len);
        // StringBuilder的底层会创建一个字符数组(默认容量为16)
        // 当容量超过16时，默认扩容*2+2=34，超出34则按实际字符数量扩容(即capacity == length)
        // capacity可查看StringBuilder容量
        int cap = sb1.capacity();
        System.out.println(cap);
        // StringBuilder对象并非等同于String对象，有时有必要将容器内容转换为字符串类型，则使用toString
        String str = sb2.toString();
        // 判断类型
        boolean flag = str instanceof String;
        System.out.println(flag);
    }
}
