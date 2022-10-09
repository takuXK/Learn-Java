package Class_and_Object.Inherit.People;

// 经理是人的一种，执行管理权力，该类将作为Person类的一个子类：

public class Manager extends Person {
    private double salary;

    public Manager() {
    }

    public Manager(String name, int age, String gender, double salary) {
        super(name, age, gender);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void PrintInfo(Manager this) {
        System.out.println(this.getSalary());
    }
}
