package Code_Structure;

public class Structure_For {
    public static void main(String[] args) {
        /* for循环格式：
        for (初始化语句; 条件判断语句; 条件控制语句){
            循环体语句;
        }*/
        for (int i = 1; i <= 10; i++) {
            System.out.println("HelloWorld"+i);
        }
        // for循环的初始化语句可以提前定义
        int j = 1;
        for (; j <= 5; j++) {
            System.out.println(j);
        }
        // 单个for循环是可以写入多个变量的循环的
        int[] arr = {1,2,3,4,5};
        for (int i = 0, k = arr.length-1; i < k; i++, k--) {
            int temp = arr[i];
            arr[i] = arr[k];
            arr[k] = temp;
        }
        for (int p = 0; p < arr.length; p++) {
            System.out.println(arr[p]);
        }
    }
}
