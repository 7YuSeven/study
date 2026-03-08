package Test07;

public class Cat extends Animal{
    public Cat() {
    }

    public Cat(String name, String color, double price) {
        super(name, color, price);
    }

    public void catchMouse(){
        System.out.println("抓老鼠");
    }
}
