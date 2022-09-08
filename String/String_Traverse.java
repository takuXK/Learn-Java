package String;

public class String_Traverse {
    public static void main(String[] args) {
        // 字符串的遍历：
        // 字符串可通过length()方法返回其长度，同时charAt方法能够返回对应索引处的字符
        String str = "HelloWorld123";

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            System.out.println(c);
        }
        // 判断字符的大小写，可通过ASCII表比较
        int lowercase = 0;
        int uppercase = 0;
        int number = 0;
        for (int j = 0; j < str.length(); j++) {
            char c = str.charAt(j);
            if (c >= 'a' && c <= 'z') {
                lowercase++;
            } else if (c >= 'A' && c <= 'Z') {
                uppercase++;
            } else if (c >= '0' && c <= '9') {
                number++;
            }
        }
        System.out.println("There are " + lowercase + " lowercases in target string.");
        System.out.println("There are " + uppercase + " uppercases in target string.");
        System.out.println("There are " + number + " numbers in target string.");
        // 方法substring可以截取字符串中的一部分：[begin index, end index)，如果未输入end index，则一直截取到末尾
        String substr = str.substring(2, 7);
        System.out.println(substr);
        // 方法replace用于替换字符串的一部分，且替换所有符合的地方
        String replacedstr = str.replace("Hello", "Hi");
        System.out.println(replacedstr);
        // 方法toCharArray用于将字符串转换为一个字符数组，以便于按位操作
        char[] str_array = str.toCharArray();
        for (int i = 0; i < str_array.length; i++) {
            System.out.print(str_array[i] + " ");
        }
    }
}
