package Test_Demo_Object_Forward.Phone_Select;

// 利用对象数组存储多个手机对象，计算均价，并打印价格低于均价的所有手机对象的信息

public class PhoneStatistic {
    public static void main(String[] args) {
        Phone[] info = new Phone[3];

        Phone p1 = new Phone("HuaWei", 4999.0, "black");
        Phone p2 = new Phone("Apple", 5999.0, "white");
        Phone p3 = new Phone("XiaoMi", 2999.0, "red");

        info[0] = p1;
        info[1] = p2;
        info[2] = p3;

        double avg_price = AvePrice(info);
        OutputInfo(info, avg_price);
    }
    // calculate the average price(input datatype: class Phone[])
    public static double AvePrice(Phone[] phone_info) {
        double sum = 0.0;
        for (int i = 0; i < phone_info.length; i++) {
            sum += phone_info[i].getPrice();
        }
        double avg = sum / phone_info.length;

        return avg;
    }
    // print phone's information if its price is lower than the avg
    public static void OutputInfo(Phone[] phone_info, double avg) {
        for (int i = 0; i < phone_info.length; i++) {
            if (phone_info[i].getPrice() < avg) {
                System.out.printf("brand: %s, price: %f, color: %s",
                        phone_info[i].getBrand(), phone_info[i].getPrice(),
                        phone_info[i].getColor());
            }
        }
    }
}
