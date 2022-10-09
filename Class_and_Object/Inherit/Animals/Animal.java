package Class_and_Object.Inherit.Animals;

// 父类：统筹子类所有重复的基础属性和基础方法，子类将通过继承的方式得到/部分/父类的属性和方法
// 子类不能调用（注意：和继承的概念不同）父类中被private修饰的属性和方法，但是子类会继承父类中被private修饰的属性
// 但是对于父类的构造方法，子类不能继承，因为会引起构造方法名的歧义，需要重写
// 对于父类的成员方法，子类只能继承其中的虚方法（非private、static、final修饰的成员方法）
// 继承关系查看readme.md

public class Animal {
    public void Eat() {
        System.out.println("Eating");
    }
    public void Drink() {
        System.out.println("Drinking");
    }
}
