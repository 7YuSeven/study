package Test11;

public class GirlFriend {
    //女朋友的属性包含：姓名，身高，体重。行为包含：洗衣服wash()，做饭cook()。另外定义一个用于展示三个属性值的show()方法。
    private String name;
    private double height;
    private double weight;

    public GirlFriend() {
    }

    public GirlFriend(String name, double height, double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void wash(){
        System.out.println(this.getName() + "帮我洗衣服");
    }

    public void cook(){
        System.out.println(this.getName() + "给我做饭");
    }

    public void show(){
        System.out.println("我女朋友叫" + this.getName() + ",身高为" + this.getHeight() + "厘米,体重为" + this.getWeight() + "斤");
    }
}
