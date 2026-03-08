package Test03;

public class Goods {
    int id;
    String name;
    double price;
    int reamain;

    public Goods(){
    }

    public Goods(int id, String name, double price, int reamain) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.reamain = reamain;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getReamain() {
        return reamain;
    }

    public void setReamain(int reamain) {
        this.reamain = reamain;
    }
}
