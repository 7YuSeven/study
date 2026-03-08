package Test13;

public class Coder {
    //            属性：姓名name，工号id，工资salary。
    //
    //            行为：工作work()
    private String name;
    private int id;
    private int salary;

    public Coder() {
    }

    public Coder(String name, int id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void work(){
        System.out.println("工号为" + this.getId() + "基本工资为" + this.getSalary() +
                "的程序员" + this.getName() + "正在努力写着代码..... ");
    }
}
