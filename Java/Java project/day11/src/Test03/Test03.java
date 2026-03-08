package Test03;

public class Test03 {
    public static void main(String[] args) {
        Dog dog = new Dog("小黑", 1);
        Frog frog = new Frog("小青", 2);
        Rabbit rabbit = new Rabbit("小白", 1);

        dog.eat();
        dog.swim();

        frog.eat();
        frog.swim();

        rabbit.eat();
    }
}
