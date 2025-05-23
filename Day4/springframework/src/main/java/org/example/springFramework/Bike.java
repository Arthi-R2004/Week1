package org.example.springFramework;
public class Bike {
    int model=2;
    private Vehicle vehicle;

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void start(){
        System.out.println("Car started");
    }
}
