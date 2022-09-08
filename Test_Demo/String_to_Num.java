package Test_Demo;

// 输入一个字符串（全数字，包括小数），将其转化为对应数字

public class String_to_Num {
    public static void main(String[] args) {
        String str = "12345";
        int result = StringtoNum(str);
        System.out.println(result);
        String str2 = "213.3482";
        double result2 = StringtoDouble(str2);
        System.out.println(result2);
    }
    // 定义方法，将一个代表数字的字符串转换为数字（整数）
    public static int StringtoNum(String str) {
        char[] char_array = str.toCharArray();
        int num = 0;
        for (int i = 0; i < char_array.length; i++) {
            char c = char_array[i];
            int integer = c - '0';
            num = num * 10 + integer;
        }
        return num;
    }
    // 定义方法，将一个代表数字的字符串转换为数字（小数）
    public static double StringtoDouble(String str) {
        int index_dot = str.indexOf(".");
        char[] int_part = str.substring(0, index_dot).toCharArray();
        char[] decimal_part = str.substring(index_dot+1).toCharArray();
        int num1 = 0;
        for (int i = 0; i < int_part.length; i++) {
            char c = int_part[i];
            int integer = c - '0';
            num1 = num1 * 10 + integer;
        }
        double num2 = 0;
        for (int j = 0; j < decimal_part.length; j++) {
            char c = decimal_part[j];
            int decimal = c - '0';
            num2 = num2 * 10 + decimal;
        };
        num2 /= Math.pow(10, decimal_part.length);
        return num1 + num2;
    }
}
