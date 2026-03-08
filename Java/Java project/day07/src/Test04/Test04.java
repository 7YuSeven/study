package Test04;

import java.util.Scanner;

public class Test04 {
    public static void main(String[] args) {
        /*
        对象数组2
            定义数组存储3部汽车对象。
            汽车的属性:品牌，价格，颜色。
            创建三个汽车对象，数据通过键盘录入而来，并把数据存入到数组当中。
         */
        Car[] cars = new Car[3];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < cars.length; i++) {
            Car c = new Car();
            System.out.println("请输入第" + (i + 1) + "辆车的信息");
            c.setName(sc.next());
            c.setPrice(sc.nextDouble());
            c.setColor(sc.next());
            cars[i] = c;
        }

        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i].getName() + ", " + cars[i].getPrice() + ", " + cars[i].getColor());
        }
    }
}
