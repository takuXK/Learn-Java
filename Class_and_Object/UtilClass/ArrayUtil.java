package Class_and_Object.UtilClass;

// 工具类
// 工具类不面向对象，而是面向特定对象所需的操作

import java.util.StringJoiner;

public class ArrayUtil {
    // 定义一个类，针对数组进行操作
    // 私有化构造方法，外部无法调用创建对象
    private ArrayUtil() {
    }
    // 工具方法需要定义为静态方法，方便调用
    // 方法1：定义一个方法，以字符串的形式返回数组内容
    public static String PrintArr(int[] arr) {
        StringJoiner sj = new StringJoiner(" ", "[", "]");
        for (int i = 0; i < arr.length; i++) {
            sj.add(arr[i] + "");
        }
        return sj.toString();
    }
    // 方法2：定义一个方法，返回数组的平均值
    public static double GetAverage(double[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        double avg = sum / arr.length;
        return avg;
    }
}
