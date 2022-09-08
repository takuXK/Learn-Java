package Code_Structure;

import java.util.Scanner;

public class Structure_Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要吃的面：");
        String noodles = sc.next();
        // switch语句格式：表达式和值比较
        // switch (表达式){
        //      case 值1:
        //      语句体1;
        //      break;
        //      case 值1:
        //      语句体1;
        //      break;
        //      ...
        //      default:
        //      语句体n;
        //      break;
        // }
        switch (noodles) {
            case "兰州拉面":
                System.out.println("兰州拉面一份");
                break; // break不能省略，否则switch下的case都会运行一遍
            case "热干面":
                System.out.println("热干面一份");
                break;
            case "炸酱面":
                System.out.println("炸酱面一份");
                break;
            case "油泼面":
                System.out.println("油泼面一份");
                break;
            default: // default可省略，当case中没有匹配项且default未写时，会自动结束switch
                System.out.println("方便面一份");
                break;
        }
    }
}
