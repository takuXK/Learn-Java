package Class_and_Object;

public class Class_Fundamental_Test {
    public static void main(String[] args) {
        Class_Fundamental phone = new Class_Fundamental(); // 初始化（创建对象）
        // 完善对象属性
        phone.brand = "HuaWei";
        phone.price = 5000;
        System.out.println(phone.brand);
        System.out.println(phone.price);
        // 调用对象方法完成目标
        phone.Call();
        phone.PlayGame();
    }
}
