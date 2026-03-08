package Test05;

public class Test05 {
    public static void main(String[] args) {
        Manager manager = new Manager("1001", "张三", 10000, 8000);
        System.out.println(manager.getId() + ", " + manager.getName() + ", " + manager.getSalary() + ", " + manager.getBounce());
        manager.eat();
        manager.work();

        System.out.println("-----------------------------------");

        Cooker cooker = new Cooker("1002", "李四", 1500);
        System.out.println(cooker.getId() + ", " + cooker.getName() + "," + cooker.getSalary());
        cooker.work();
        cooker.eat();
    }
}
