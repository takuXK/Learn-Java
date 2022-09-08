package ArrayList;

import java.util.ArrayList;

public class ArrayList_Fundamental2 {
    public static void main(String[] args) {
        // 在集合中，直接数据类型并不能正常定义为泛型，而是使用对应的包装类：
        // int -> Integer
        // byte -> Byte
        // char -> Character
        // long -> Long
        // float -> Float
        // double -> Double
        ArrayList <Integer> list = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            list.add(i + 1);
        }
        System.out.println(list.get(3));
    }
}
