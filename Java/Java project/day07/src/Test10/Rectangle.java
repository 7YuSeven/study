package Test10;

public class Rectangle {
    private int length;
    private int width;

    public Rectangle() {
    }

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void area() {
        System.out.println("长为：" + this.length + ",宽为：" + this.width + ",的矩形的面积为：" + (this.width * this.length));
    }

    public void size() {
        System.out.println("长为：" + this.length + ",宽为：" + this.width + ",的矩形的周长为：" + ((this.width + this.length) * 2));
    }
}
