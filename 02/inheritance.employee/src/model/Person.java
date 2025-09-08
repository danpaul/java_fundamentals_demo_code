package model;

// note, no public declaration means this class is only visible within this
//  package
public abstract class Person {
    protected String name;
    protected String email;

    public Person(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public abstract void printInfo();
}
