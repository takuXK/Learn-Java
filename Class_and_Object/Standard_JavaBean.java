package Class_and_Object;

public class Standard_JavaBean {
    // 一个标准的JavaBean类，包含：
    // 1.private化的参数
    private String username;
    private String password;
    private String email;
    private String gender;
    private int age;
    // 在参数完成基础上，可通过alt+insert或者alt+fn+insert来快速创建2-4部分
    // 2.空参构造
    public Standard_JavaBean() {}
    // 3.实参构造
    public Standard_JavaBean(String username, String password,
                             String email, String gender, int age) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.gender = gender;
        this.age = age;
    }
    // 4.属性（参数）对应的set方法和get方法
    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    // 5.其它相关方法
    public boolean username_verify() {
        if (this.username == "xiaoming") {
            return true;
        } else {
            return false;
        }
    }
}
