package Test02;

public class Test02 {
    public static void main(String[] args) {
        Frog f = new Frog("青蛙", 1);
        Dog dog = new Dog("小黑", 2);
        Sheep sheep = new Sheep("小绵", 2);

        f.eat();
        f.drink();

        dog.eat();
        dog.drink();

        sheep.eat();
        sheep.drink();

    }
}
