package org.example.springFramework;

public class Vehicle {
    int model;
    public void start() {
        System.out.println("Vehicle started: "+model+" wheeler");
    }

    public void setModel(int model) {
        this.model = model;
    }
}
