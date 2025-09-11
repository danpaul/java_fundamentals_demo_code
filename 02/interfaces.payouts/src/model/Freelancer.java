package model;

import model.interfaces.Payable;

// including implements here for illustration but it is not needed since Worker also implements
//  Payable
public class Freelancer extends Worker implements Payable {
    protected int hoursWorked;
    protected double hourlyRate;

    public Freelancer(int hoursWorked, double hourlyRate) {
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double getPayout() {
        return this.hourlyRate * this.hoursWorked;
    }
}
