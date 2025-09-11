package model;

import model.interfaces.Payable;

abstract class Worker implements Payable {
    @Override
    public void printInfo() {
        System.out.println(getClass().getName() + " monthly salary: " + String.format("%.2f €", this.getPayout()));
    }
}
