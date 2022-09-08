package Fundamental_Knowledge;

public class Plus_for_String_Char {
    public static void main(String[] args) {
        // 符号 + 在字符串、字符中应为拼接符号，而非计算符号
        int a = 123;
        String b = "123";
        System.out.println(a + b); // 变为字符串叠加
        // 注意：连续 + 时，为从左往右逐步操作
        int c = 1;
        int d = 99;
        String e = "haha";
        System.out.println(c + d + e); // 1+99为计算，后一次为叠加
    }
}
