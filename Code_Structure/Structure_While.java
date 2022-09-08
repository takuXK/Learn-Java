package Code_Structure;

public class Structure_While {
    public static void main(String[] args) {
        /*while循环格式：
        while (条件判断语句) {
            循环体语句;
            条件控制语句;
        }*/
        int i = 1;
        while (i <= 100) {
            System.out.println(i);
            i++;
        }
        // 注意：相比for循环，while适用于未知循环次数但是循环结束条件的循环结构代码
    }
}
