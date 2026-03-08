package Test06;

public class Test06 {
    public static void main(String[] args) {
        Lecturer lecturer = new Lecturer("001", "张三");
        System.out.println(lecturer.getId() + ", " + lecturer.getName());
        lecturer.work();

        System.out.println("------------------------");

        Tutor tutor = new Tutor("002", "李四");
        System.out.println(tutor.getId() + ", " + tutor.getName());
        tutor.work();

        System.out.println("------------------------");

        Maintainer maintainer = new Maintainer("003", "王五");
        System.out.println(maintainer.getId() + ", " + maintainer.getName());
        maintainer.work();

        System.out.println("------------------------");

        Buyer buyer = new Buyer("004", "李华");
        System.out.println(buyer.getId() + ", " + buyer.getName());
        buyer.work();
    }
}
