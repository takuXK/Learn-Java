package Test_Demo_Object_Forward.Students_Manage;

// 建议学生管理，可根据id增加，删除，改变属性等

public class StuManage {
    public static void main(String[] args) {
        Student stu1 = new Student(001, "xiaoming", 23);
        Student stu2 = new Student(002, "xiaohong", 22);
        Student stu3 = new Student(003, "xiaohang", 25);

        Student[] stulib = new Student[3];

        stulib[0] = stu1;
        stulib[1] = stu2;
        stulib[2] = stu3;
        // 查询学生信息
        Student stuinfo = SeekId(stulib, 001);
        System.out.println("================================");
        // 增加学生信息
        Student stu4 = new Student(004, "xiaomei", 24);
        Student[] addlib = AddStudent(stulib, stu4);
        StudentInfo(addlib);
        System.out.println("================================");
        // 删除学生信息
        Student[] deletedlib = DeleteStudent(addlib, 004);
        StudentInfo(deletedlib);
        System.out.println("================================");
        // 改变年龄信息
        Student[] changelib = ChangeAge(deletedlib, 003, 24);
        StudentInfo(changelib);
    }
    // id搜寻功能
    public static Student SeekId(Student[] stulib, int id) {
        for (int i = 0; i < stulib.length; i++) {
            if (stulib[i].getId() == id) {
                System.out.println("student id: 00" + id);
                System.out.println("student name: " + stulib[i].getName());
                return stulib[i];
            }
        }
        System.out.println("cannot find student whose id is 00" + id + ".");
        return new Student(000, "no name", 0);
    }
    // 增加学生信息功能
    public static Student[] AddStudent(Student[] stulib, Student newstu) {
        boolean flag = CheckId(stulib, newstu.getId());
        if (!flag) {
            // 判断stulib中是否有空位置
            int stunum = CountStudent(stulib);
            if (stunum == stulib.length) {
                Student[] newstulib = new Student[stunum + 1];
                for (int i = 0; i < stulib.length; i++) {
                    newstulib[i] = stulib[i];
                }
                newstulib[stunum] = newstu;
                return newstulib;
            } else {
                stulib[stunum] = newstu;
                return stulib;
            }
        } else {
            System.out.println("student's id: 00" + newstu.getId() + " is repeated.");
        }
        return stulib;
    }
    // 删除学生信息
    public static Student[] DeleteStudent(Student[] stulib, int id) {
        for (int i = 0; i < stulib.length; i++) {
            if (stulib[i].getId() == id) {
                stulib[i] = null;
                return stulib;
            }
        }
        System.out.println("cannot find student whose id is 00" + id + ".");
        return stulib;
    }
    // 改变年龄信息
    public static Student[] ChangeAge(Student[] stulib, int id, int newage) {
        for (int i = 0; i < stulib.length; i++) {
            if (stulib[i].getId() == id) {
                stulib[i].setAge(newage);
                return stulib;
            }
        }
        System.out.println("cannot find student whose id is 00" + id + ".");
        return stulib;
    }
    // 确认id是否唯一
    public static boolean CheckId(Student[] stulib, int id) {
        for (int i = 0; i < stulib.length; i++) {
            if (stulib[i].getId() == id) {
                return true;
            }
        }
        return false;
    }
    // 计算一个数组中非空元素数量
    public static int CountStudent(Student[] stulib) {
        int count = 0;
        for (int i = 0; i < stulib.length; i++) {
            if (stulib[i] != null) {
                count++;
            }
        }
        return count;
    }
    // 快速遍历打印学生信息
    public static void StudentInfo(Student[] stulib) {
        for (int i = 0; i < stulib.length; i++) {
            if (stulib[i] != null) {
                System.out.printf("id: %d, name: %s, age: %d\n",
                        stulib[i].getId(), stulib[i].getName(), stulib[i].getAge());
            }
        }
    }
}
