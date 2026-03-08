package Test07;

public class Test07 {
    public static void main(String[] args) {
        /*
        请使用继承定义以下类:

            狗(Dog)
              成员变量: 姓名,颜色,价格
              成员方法: 吃饭,看家

            猫(Cat)
              成员变量: 姓名,颜色,价格
              成员方法: 吃饭,抓老鼠
         */

        Dog dog = new Dog("边牧", "白色", 500);
        System.out.println(dog.getName() + ", " + dog.getColor() + ", " + dog.getPrice());
        dog.eat();
        dog.lookHome();

        System.out.println("-----------------------------------------");

        Cat cat = new Cat("波斯猫", "黑色", 300);
        System.out.println(cat.getName() + ", " + cat.getColor() + ", " + cat.getPrice());
        cat.eat();
        cat.catchMouse();
    }
}
