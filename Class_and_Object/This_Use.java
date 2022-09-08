package Class_and_Object;

public class This_Use {
    // 就近原则：当存在多个同名变量（但这些同名变量不是同一个变量，指向不同内存）时，
    // 如果调用该变量，程序将选择与其接近的变量
    private int age;
    // 无参构造（初始化需要进行一些简单输出时编写，一般和有参构造同时存在）
    public This_Use() {
        System.out.println("for Init.");
    }
    // 上述代码可以定义在类的初始化方法中，以便根据不同对象改变属性值（有参构造）
    public This_Use (int age) {
        this.age = age;
    }

    public void method() {
        int age = 10;
        System.out.println(age);  // 这里age将使用上面一行临近的局部变量age
        System.out.println(this.age); // 如果要使用成员变量（类中全局变量），则需在前面加上this关键字
    }

    public void setAge(int age1) {
        this.age = age1;
    }
    public int getAge() {
        return this.age;
    }
}