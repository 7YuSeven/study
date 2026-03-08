package Test09;

public class Test09 {
    public static void main(String[] args) {
        /*
        属性：车的品牌(brand)，车的类型(type) ;
        方法：启动方法(start()) 行驶的方法(run()) ;

        在测试类中通过对象完成成员变量和成员方法的使用

        要求:
	        1.成员变量private修饰,提供get/set方法,空参满参构造
	        2.运行效果通过两种方式实现
		            (1)空参构造创建对象,set方法赋值
		            (2)满参构造直接创建对象
         */
        Car car = new Car("保时捷", "保时捷");
        car.start();
        car.run();
    }
}
