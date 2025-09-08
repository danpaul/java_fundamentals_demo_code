package model;

import model.interfaces.Payable;

abstract class Worker implements Payable {
    public void printInfo() {
        System.out.println(this.getClass().getName() + " monthly salary: " + String.format("%.2f €", this.getPayout()));
    }
}
