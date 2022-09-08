package Class_and_Object.UtilClass;

public class Test_ArrayUtil {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 4, 5, 6};
        String str1 = ArrayUtil.PrintArr(arr1);
        System.out.println(str1);

        double[] arr2 = {21.4, 56.6, 12.5, 34.6, 47.8};
        double avg = ArrayUtil.GetAverage(arr2);
        System.out.println("the average of array is " + avg + ".");
    }
}
