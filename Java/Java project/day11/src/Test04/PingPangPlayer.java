package Test04;

public class PingPangPlayer extends Player implements SpeakEnglish {
    public PingPangPlayer() {
    }

    public PingPangPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("乒乓球运动员在学习打乒乓球");
    }

    @Override
    public void speak() {
        System.out.println("乒乓球运动员在说英语");
    }
}
