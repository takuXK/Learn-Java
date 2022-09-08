package Test_Demo;

import java.util.Random;

// 生成一个五位验证码，包含大小写字母和最后一位数字

public class Verify_Code_Generator {
    public static void main(String[] args) {
        String verify_code = "";
        char[] target_char_array = Char_Generator(26);
        for (int i = 0; i < 4; i++) {
            char result_char = Select_Char(target_char_array, target_char_array.length);
            verify_code += result_char;
        }
        int[] target_int_array = Num_Generator();
        int result_num = Select_Num(target_int_array, target_int_array.length);
        verify_code += result_num;
        verify_code = RandomString(verify_code);
        System.out.println(verify_code);
    }
    // 定义一个方法，可在输入数组中随机抽取字母
    public static char Select_Char(char[] char_array, int count) {
        Random rand = new Random();
        int rand_index = rand.nextInt(count);
        return char_array[rand_index];
    }
    // 定义一个方法，可在输入数组中随机抽取数字
    public static int Select_Num(int[] num_array, int count) {
        Random rand = new Random();
        int rand_index = rand.nextInt(count);
        return num_array[rand_index];
    }
    // 定义一个方法，生成一个字母数组(包含前count个字母)
    public static char[] Char_Generator(int count) {
        char[] char_array = new char[count*2];
        for (int i = 0; i < char_array.length; i++) {
            if (i <= count) {
                char_array[i] = (char) (65 + i);
            } else {
                char_array[i] = (char) (97 + i - count);
            }
        }
        return char_array;
    }
    // 定义一个方法，生成一个数组(0-9)
    public static int[] Num_Generator() {
        int[] num_array = new int[10];
        for (int k = 0; k < num_array.length; k++) {
            num_array[k] = k;
        }
        return num_array;
    }
    // 定义一个方法，随机打乱一个字符串中的字符顺序
    public static String RandomString(String str) {
        Random rand = new Random();
        char[] str_array = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            int index = rand.nextInt(str.length());
            char temp = str_array[i];
            str_array[i] = str_array[index];
            str_array[index] = temp;
        }
        return new String(str_array);
    }
}
