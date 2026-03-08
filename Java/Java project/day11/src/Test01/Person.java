package Test01;

public class Person {
    /*
                属性:
            姓名，年龄
            行为:
            keepPet(Dog dog,String something)方法
            功能:喂养宠物狗，something表示喂养的东西
            行为:
            keepPet(Cat cat,String something)方法
            功能:喂养宠物猫，something表示喂养的东西
            生成空参有参构造，set和get方法
     */
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /*
                keepPet(Dog dog,String somethind)方法打印内容如下:
            年龄为30岁的老王养了一只黑颜色的2岁的狗
            2岁的黑颜色的狗两只前腿死死的抱住骨头猛吃
            keepPet(cat cat,String somethind)方法打印内容如下:
            年龄为25岁的老李养了一只灰颜色的3岁的猫
            3岁的灰颜色的猫眯着眼睛侧着头吃鱼
     */

//    public void keepPet(Dog dog, String something){
//        System.out.println("年龄为" + getAge() + "岁的" + getName() +
//                "养了一只" + dog.getColor() + "颜色的" + dog.getAge() + "岁的狗");
//        dog.eat(something);
//    }
//
//    public void keepPet(Cat cat, String something){
//        System.out.println("年龄为" + getAge() + "岁的" + getName() +
//                "养了一只" + cat.getColor() + "颜色的" + cat.getAge() + "岁的猫");
//        cat.eat(something);
//    }

    public void keepPet(Animal animal, String something) {
        if (animal instanceof Dog dog) {
            System.out.println("年龄为" + getAge() + "岁的" + getName() +
                    "养了一只" + dog.getColor() + "颜色的" + dog.getAge() + "岁的狗");
            dog.eat(something);
        } else if (animal instanceof Cat cat) {
            System.out.println("年龄为" + getAge() + "岁的" + getName() +
                    "养了一只" + cat.getColor() + "颜色的" + cat.getAge() + "岁的猫");
            cat.eat(something);
        }

    }

}
