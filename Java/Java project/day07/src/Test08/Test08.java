package Test08;

public class Test08 {
    public static void main(String[] args) {
        /*
        对象数组5
                定义一个长度为3的数组，数组存储1~3名学生对象作为初始数据，学生对象的学号，姓名各不相同。
                学生的属性:学号，姓名，年龄。
                要求1:再次添加一个学生对象，并在添加的时候进行学号的唯一性判断。
                要求2:添加完毕之后，遍历所有学生信息。
                要求3:通过id删除学生信息
                    如果存在，则删除，如果不存在，则提示删除失败。
                要求4:删除完毕之后，遍历所有学生信息。
                要求5:查询数组id为“2”的学生，如果存在，则将他的年龄+1岁
         */
        Student[] students = new Student[3];
        Student s1 = new Student(1, "张三", 18);
        Student s2 = new Student(2, "李斯", 19);
        Student s3 = new Student(3, "王五", 21);

        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        Student s4 = new Student(4,"李华",20);

        int id = s4.getId();
        //添加学生信息
        int count = getLength(students);
        if (copareId(students, id)) {
            System.out.println("学号重复，请重新输入");
        } else {
            if (count == students.length) {
                Student[] newStudents = new Student[count + 1];
                newStudents = getNewArr(students, newStudents);
                newStudents[count] = s4;
                printArr(newStudents);
            } else {
                students[count] = s4;
                printArr(students);
            }
        }

        System.out.println("------------------------------------------------------");

        //删除学生信息

        int stuId = 2;

        if (copareId(students, stuId)) {
            students[stuId] = null;
        } else {
            System.out.println("该学生不存在，删除失败");
        }

        printArr(students);

        System.out.println("------------------------------------------------------");

        int searchId = 1;

        //查询学生信息
        if(copareId(students, searchId) && students[searchId] != null){
            Student stu = students[searchId];
            int age = stu.getAge() + 1;
            stu.setAge(age);
            System.out.println(stu.getId() + ", " + stu.getName() + ", " + stu.getAge());
        } else {
            System.out.println("该学生不存在，查询失败");
        }

        System.out.println("------------------------------------------------------");

        printArr(students);
    }

    public static boolean copareId(Student[] students, int id){
        for (int i = 0; i < students.length; i++) {
            Student stu = students[i];
            if (stu.getId() == id) {
                return true;
            }
        }

        return false;
    }

    public static int getLength(Student[] students){
        int count = 0;
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                count++;
            }
        }
        return count;
    }

    public static Student[] getNewArr(Student[] arr, Student[] newArr){
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }

        return newArr;
    }

    public static void printArr(Student[] arr){
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];
            if (stu != null) {
                System.out.println(stu.getId() + ", " + stu.getName() + ", " + stu.getAge());
            }
        }
    }
}
