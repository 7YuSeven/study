package Test05;

public class Manager extends Employee{
    private double bounce;

    public Manager() {
    }

    public Manager(String id, String name, double salary, double bounce) {
        super(id, name, salary);
        this.bounce = bounce;
    }

    public double getBounce() {
        return bounce;
    }

    public void setBounce(double bounce) {
        this.bounce = bounce;
    }

    @Override
    public void work() {
        System.out.println("管理其他人");
    }
}
