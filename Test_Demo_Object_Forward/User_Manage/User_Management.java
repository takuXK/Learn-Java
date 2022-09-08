package Test_Demo_Object_Forward.User_Manage;

import java.util.ArrayList;

public class User_Management {
    public static void main(String[] args) {
        ArrayList<User> user_list = new ArrayList<>();

        User u1 = new User("20220827-1", "xiaoming", "123456");
        User u2 = new User("20220827-2", "xiaohong", "654321");
        User u3 = new User("20220827-3", "xiaogang", "999999");
        User u4 = new User("20220827-4", "xiaolong", "888888");

        user_list.add(u1);
        user_list.add(u2);
        user_list.add(u3);
        user_list.add(u4);

        ArrayList<User> userinfo = ReturnInfo(user_list, "20220827-2");
        for (int i = 0; i < userinfo.size(); i++) {
            System.out.println(userinfo.get(i).getId() + " " + userinfo.get(i).getUsername());
        }
    }
    // 定义一个方法，返回用户列表里指定id(不包含)前面所有用户信息
    // 在方法中可以返回集合，返回数据类型为ArrayList<泛型>
    public static ArrayList<User> ReturnInfo(ArrayList<User> usrlist, String id) {
        ArrayList<User> resultlst = new ArrayList<>();
        for (int i = 0; i < usrlist.size(); i++) {
            User u = usrlist.get(i);
            if (u.getId().equals(id)) {
                break;
            } else {
                resultlst.add(u);
            }
        }
        return resultlst;
    }
}
