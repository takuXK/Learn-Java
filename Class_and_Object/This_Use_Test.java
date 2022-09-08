package Class_and_Object;

public class This_Use_Test {
    public static void main(String[] args) {
        This_Use demo = new This_Use(12); // 有参调用
        System.out.println(demo.getAge());
        demo.setAge(18);
        System.out.println(demo.getAge());
        demo.method();

        This_Use demo2 = new This_Use(); // 空参调用
    }
}
