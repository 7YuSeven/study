package Test02;

import java.util.ArrayList;

public class StudentUtil {
    public static int getMaxAge(ArrayList<Student> studentArrayList){
        int max = studentArrayList.get(0).getAge();

        for (int i = 0; i < studentArrayList.size(); i++) {
            Student s = studentArrayList.get(i);
            if (s.getAge() > max) {
                max = s.getAge();
            }
        }

        return max;
    }
}
