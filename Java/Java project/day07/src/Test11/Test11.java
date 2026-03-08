package Test11;

public class Test11 {
    public static void main(String[] args) {
        /*
        女朋友的属性包含：姓名，身高，体重。行为包含：洗衣服wash()，做饭cook()。另外定义一个用于展示三个属性值的show()方法。

        要求:
	        1.成员变量private修饰,提供get/set方法,空参满参构造
	        2.运行效果通过两种方式实现
		        (1)空参构造创建对象,set方法赋值
		        (2)满参构造直接创建对象

        请在测试类中创建对象并给成员变量赋值，然后分别调用展示方法、洗衣服方法和做饭方法。打印效果如下：
                我女朋友叫XXX,身高165.0厘米,体重130.0斤
                XXX帮我洗衣服
                XXX给我做饭
         */

        GirlFriend girlFriend = new GirlFriend("张三", 180.0, 100.0);
        girlFriend.show();
        girlFriend.wash();
        girlFriend.cook();
    }
}
