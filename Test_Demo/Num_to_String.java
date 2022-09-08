package Test_Demo;

import java.util.Scanner;

// 输入一个整数表示金额，自动转换为大写格式

public class Num_to_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int money;
        while (true) {
            System.out.println("Pls input the amount: ");
            money = sc.nextInt();
            if (money >= 0 && money <= 9999999) {
                break;
            } else {
                System.out.println("the amount you put in is invalid!");
            }
        }
        int[] money_reshape = NumToArray(money);
        char[] capital_money = new char[7];
        for (int i = 0; i < money_reshape.length; i++) {
            capital_money[i] = NumToCharacter(money_reshape[i]);
        }
        String capital = CapitalMoney(capital_money);
        System.out.println(capital);
    }
    // 定义一个方法，将输入的单个数字转换为对应大写字符
    public static char NumToCharacter(int num) {
        char[] chs = {'零', '壹', '贰', '叁', '肆', '伍', '陆', '柒', '捌', '玖'};
        return chs[num];
    }
    // 定义一个方法，将一个数字拆分为数组
    public static int[] NumToArray(int num) {
        int[] result = new int[7];
        int index = 1;
        while (num != 0) {
            int last = num % 10;
            num /= 10;
            result[7-index] = last;
            index++;
        }
        return result;
    }
    // 定义一个方法，将一个字符数组转换为金额
    public static String CapitalMoney(char[] chs) {
        String[] unit = {"佰", "拾", "万", "仟", "佰", "拾", "元整"};
        String result = "";
        for (int i = 0; i < chs.length; i++) {
            result += (chs[i] + unit[i]);
        }
        return result;
    }
}
