package Class_and_Object.Static;

public class Student {
    private String name;
    private int age;
    private String gender;
    // 当在创建一个班级内所有的学生对象时，他们应该有共同的老师，则可以通过static关键字来省略该属性的重复输入
    public static String teachername;

    public Student() {
    }

    public Student(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    // 定义一个方法，打印学生所有相关信息
    // this: 指向调用对象的地址值，详见下面注释的代码
    public void PrintInfo(Student this) {
        // System.out.println(this);
        System.out.println(this.name + " " + this.age + " "
                + this.gender + " " + teachername);
    }
    // 静态方法中没有this关键字
    // 静态方法只能访问静态
    // 非静态方法可访问所有关键字、方法
    public static void TestStaticMethod(String name) {
        System.out.println("this is a test for static method.");
        // System.out.println(this.name);
        System.out.println(name);
    }
}
