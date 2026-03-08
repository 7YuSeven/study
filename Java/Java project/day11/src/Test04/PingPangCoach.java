package Test04;

public class PingPangCoach extends Coach implements SpeakEnglish{
    public PingPangCoach() {
    }

    public PingPangCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("乒乓球教练在教队员打乒乓球");
    }

    @Override
    public void speak() {
        System.out.println("乒乓球教练在说英语");
    }
}
