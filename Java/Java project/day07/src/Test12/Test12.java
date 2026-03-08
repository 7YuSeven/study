package Test12;

public class Test12 {
    public static void main(String[] args) {
        /*
        定义手机类，手机有品牌(brand),价格(price)和颜色(color)三个属性，有打电话call()和sendMessage()两个功能。

        请定义出手机类，类中要有空参、有参构造方法，set/get方法。

        定义测试类，在主方法中使用空参构造创建对象，使用set方法赋值。

        调用对象的两个功能，打印效果如下：

        正在使用价格为3998元黑色的小米手机打电话....
        正在使用价格为3998元黑色的小米手机发短信....
         */

        Phone phone = new Phone("华为", 2000.0, "白色");
        phone.call();
        phone.sendMessage();
    }
}
