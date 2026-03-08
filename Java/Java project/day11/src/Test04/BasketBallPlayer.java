package Test04;

public class BasketBallPlayer extends Player{
    public BasketBallPlayer() {
    }

    public BasketBallPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("篮球运动员在学习如何打篮球");
    }
}
