package model;

public class Student implements Comparable<Student> {
    String firstName;
    String lastName;

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    @Override
    public int compareTo(Student student) {
        int lastNameComparison = this.lastName.compareTo(student.lastName);
        if(lastNameComparison != 0){ return lastNameComparison; }
        return this.firstName.compareTo(student.firstName);
    }

    @Override
    public String toString() {
        return this.lastName + ", " + this.firstName;
    }
}