import model.Student;

import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Student> students = new TreeSet<>();
        students.add(new Student("Jack", "Jackie"));
        students.add(new Student("Jane", "Jackie"));
        students.add(new Student("Jack Junior", "Jackie"));
        students.add(new Student("Jackie", "Jackson"));

        System.out.println("********* Sorted list of students: **********");
        for (Student student : students){
            System.out.println(student);
        }
    }
}