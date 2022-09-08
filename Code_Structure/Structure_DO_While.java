package Code_Structure;

public class Structure_DO_While {
    public static void main(String[] args) {
        /*do while循环格式:
        do{
            循环体语句;
            条件控制语句;
        } while (条件判断语句)*/
        // 相比while，循环至少会执行一次，因为while条件判断相较于循环体是后验证的
        int i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i < 0);
    }
}
