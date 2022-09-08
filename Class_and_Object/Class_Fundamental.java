package Class_and_Object;

public class Class_Fundamental {
    // 对于一个类（可代表某一具体事物，即对象），最基本的组成部分包括：属性和方法
    // 这里以手机为例，实际上类名应为Phone，为了写笔记，命名为Class_Fundamental
    // 类中包含属性：
    String brand; // 手机品牌
    double price; // 手机价格
    // 类其实会默认创建一个初始化方法（类似于python类中的init），它在创建时会自动执行，而不像其它方法需要调用执行
    // 初始化方法可以手动编写，以依靠初始化得到更多功能：
    public Class_Fundamental() {
        System.out.println("it will run automatically.");
    }
    // 类中还包含相应方法，描述对象可进行的行为：
    // 打电话
    public void Call() {
        System.out.println("call.");
    }
    // 玩游戏
    public void PlayGame() {
        System.out.println("play game.");
    }
    // 在定义了类的基础上，可以在其它script中进行调用，从而便于重复生成对象，这些对象往往具有类似的特性，但具体值不同
    // 调用请参考Class_Fundamental_Test
    // 相比原来在main函数底下定义一些类（测试类）并在相同script中完成调用（无需初始化），
    // 这类不写main函数，为了方便其它script多次调用的类，被称为JavaBean类
}
