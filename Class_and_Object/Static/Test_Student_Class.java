package Class_and_Object.Static;

public class Test_Student_Class {
    public static void main(String[] args) {
        // 可以针对类直接创建static属性
        Student.teachername = "wang";

        Student s1 = new Student();
        s1.setName("xiaoming");
        s1.setAge(23);
        s1.setGender("male");
        // 单次指定即可在所有基于该类的对象上生效
        // s1.teachername = "wang";

        s1.PrintInfo();

        Student s2 = new Student();
        s2.setName("xiaohong");
        s2.setAge(22);
        s2.setGender("female");
        // s2.teachername = "wang";

        s2.PrintInfo();
    }
}
