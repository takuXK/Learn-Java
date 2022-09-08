package Array;

public class Array_Traverse {
    public static void main(String[] args) {
        // 针对一个数组，可以使用数组名.length来获取其长度
        // 通过该方法，可以使用for循环遍历数组
        int arr[] = {1,2,3,4,5};
        System.out.println(arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        // demo:遍历求和
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("the sum of array is: " + sum);
    }
}
