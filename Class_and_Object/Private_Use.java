package Class_and_Object;

public class Private_Use {
    // private关键字是一个权限修饰符
    // 可以修饰成员变量和成员方法
    // 被private修饰的成员只能在本类中访问
    private String name; // 此时属性被锁住，外部无法访问设置、更改
    private int age;
    // 为了外部能够进行具有一定自由度的设置，需要同时定义设置和获取方法
    public void setName(String name1) {
        name = name1;
    }
    public String getName() {
        return name;
    }

    public void setAge(int age1) {
        if (age1 >= 18 && age1 <= 50) {
            age = age1;
        } else {
            System.out.println("data is illegal.");
        }
    }
    public int getAge() {
        return age;
    }
    // 通过private关键字和set/get方法，可对创建对象的相关属性加入一定的约束
}
