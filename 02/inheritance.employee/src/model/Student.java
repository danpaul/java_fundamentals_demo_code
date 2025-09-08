package model;

public class Student extends Person {
    public String group;

    public Student(String name, String email, String group) {
        super(name, email);
        this.group = group;
    }

    @Override
    public void printInfo() {
        System.out.println(this);
    }

    // like C#, `toString()` is automatically defined on the ultimate base class `Object`
    @Override
    public String toString() {
        return "Student: " + this.name + ", Group: " + this.group;
    }
}
