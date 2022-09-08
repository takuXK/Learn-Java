package Class_and_Object.Inherit.Animals;

// 父类：统筹子类所有重复的基础属性和基础方法，子类将通过继承的方式得到/部分/父类的属性和方法
// 子类不能继承父类中被private修饰的属性和方法
// 继承关系查看readme.md

public class Animal {
    public void Eat() {
        System.out.println("Eating");
    }
    public void Drink() {
        System.out.println("Drinking");
    }
}
