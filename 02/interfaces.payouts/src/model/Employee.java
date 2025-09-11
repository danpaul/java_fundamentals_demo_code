package model;

import model.interfaces.Payable;

// including implements here for illustration but it is not needed since Worker also implements
//  Payable
public class Employee extends Worker implements Payable {
    protected double yearlySalary;
    final static int MONTHS_IN_YEAR = 12;

    public Employee(double yearlySalary) {
        this.yearlySalary = yearlySalary;
    }

    public double getPayout() {
        return this.yearlySalary / MONTHS_IN_YEAR * 0.7;
    }
}
