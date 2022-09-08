package Test_Demo;

// 写一个类，针对输入数组的起始索引（包含）至结束索引（不包含）区间内的数复制并返回

public class Copy_Array {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9};
        int[] result = CopyArray(array, 3, 6);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + ", "); // print表示不换行；println换行
        }
    }

    public static int[] CopyArray(int[] arr, int from, int end) {
        int[] result_array = new int[end - from];
        for (int i = from; i < end; i++) {
            result_array[i - from] = arr[i];
        }
        return result_array;
    }
}
