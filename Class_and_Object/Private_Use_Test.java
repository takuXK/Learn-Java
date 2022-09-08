package Class_and_Object;

public class Private_Use_Test {
    public static void main(String[] args) {
        Private_Use demo = new Private_Use();
        // 此时，需要通过方法进行属性值的设置和获取
        demo.setName("xiaoming");
        demo.setAge(18);
        System.out.println(demo.getName());
        System.out.println(demo.getAge());
    }
}
