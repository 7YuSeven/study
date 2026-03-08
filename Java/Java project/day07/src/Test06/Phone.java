package Test06;

public class Phone {
    private String name;
    private double price;
    private String color;

    public Phone() {
    }

    public Phone(String name, double price, String color) {
        this.color = color;
        this.price = price;
        this.name = name;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
