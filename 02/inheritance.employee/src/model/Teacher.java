package model;


public class Teacher extends Person {
    public double monthlySalary;
    final static private int MONTHS_IN_YEAR = 12;
    final static private int BONUS_PAYMENTS = 2;

    public Teacher(String name, String email, double monthlySalary) {
        super(name, email);
        this.monthlySalary = monthlySalary;
    }

    public double getYearlySalary() {
        return (MONTHS_IN_YEAR + BONUS_PAYMENTS) * this.monthlySalary;
    }

    @Override
    public void printInfo() {
        System.out.println(this);
    }

    // like C#, `toString()` is automatically defined on the ultimate base class `Object`
    @Override
    public String toString() {
        return "Teacher: " + name + ", Yearly Salary: " + String.format("%.2f €", getYearlySalary());
    }
}
