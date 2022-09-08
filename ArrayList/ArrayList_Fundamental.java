package ArrayList;

import java.util.ArrayList;

public class ArrayList_Fundamental {
    public static void main(String[] args) {
        // 集合
        // 集合相比数组，其长度在定义后是可变的，但是集合是不可存储基本数据类型的，只能存储引用数据类型
        // ArrayList是集合中最基本的一种
        ArrayList<String> list = new ArrayList<>();
        // 通过<数据类型>（泛型）来限定集合中的数据类型形式
        System.out.println(list);
        // add方法向集合添加元素，返回值为是否添加成功的布尔值
        boolean flag = list.add("aqq");
        System.out.println(flag);
        list.add("adhak");
        System.out.println(list);
        // remove方法删除对应(索引)元素，当输入为索引时，返回值为被删除的元素，否则为是否删除成功的布尔值
        // list.remove("aqq");
        String remove_ele = list.remove(0);
        System.out.println(remove_ele);
        System.out.println(list);
        // set方法修改指定索引的元素，返回值是被修改前的元素
        String formal = list.set(0, "asdjla");
        System.out.println(formal);
        System.out.println(list);
        // get方法查询指定索引元素的内容，返回值是查询值
        String getvalue = list.get(0);
        System.out.println(getvalue);
        // size方法获取集合的长度
        int s = list.size();
        System.out.println(s);
        // 集合的遍历
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
