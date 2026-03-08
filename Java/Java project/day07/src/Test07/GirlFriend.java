package Test07;

public class GirlFriend {
    private String name;
    private int age;
    private char sex;
    private String hobby;

    public GirlFriend() {
    }

    public GirlFriend(String name, int age, char sex, String hobby) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.hobby = hobby;
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

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
}
