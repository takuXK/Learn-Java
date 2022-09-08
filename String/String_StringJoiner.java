package String;

import java.util.StringJoiner;

public class String_StringJoiner {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        // StringJoiner对象相比StringBuilder对象，在初始化时能够指定分隔符、开始符和结束符
        StringJoiner sj = new StringJoiner(", ", "[", "]");
        for (int i = 0; i < arr.length; i++) {
            // add添加字符串
            sj.add(arr[i] + "");
        }
        // length返回容器中字符长度
        int len = sj.length();
        System.out.println(len);
        // 使用toString将StringJoiner对象转换为String对象
        String str = sj.toString();
        boolean flag = str instanceof String;
        System.out.println(flag);
    }
}
