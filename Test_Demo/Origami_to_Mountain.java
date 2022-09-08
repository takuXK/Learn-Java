package Test_Demo;

// 珠穆朗玛峰的高度是8844430mm，一张无限大的纸张厚度为0.1mm，求解纸张对折多少次厚度大于等于山峰高度

public class Origami_to_Mountain {
    public static void main(String[] args) {
        double current_h = 0.1;
        double mountain_h = 8844430.0;
        int ori_count = 0;
        while (current_h < mountain_h) {
            current_h *= 2;
            ori_count++;
        }
        System.out.println("the number of ori is: " + ori_count);
        System.out.println("the final height of paper is: " + current_h);
    }
}
