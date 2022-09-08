package Class_and_Object.Inherit.Animals;

// 可通过以下语句进行子类继承：
// public class 子类名 extends 父类名
// 同时，子类还可在父类的基础上新增属性和方法，实现更强大的功能，所有的类都是Object类的子类
// java只支持单继承，但可以多层继承
// 子类可以继承直接父类和间接父类的属性和方法，但是不能继承体系内和其无关的父类的属性和方法

public class Cat extends Animal{
    public void CatchMouse() {
        System.out.println("Catching mouses");
    }
}
