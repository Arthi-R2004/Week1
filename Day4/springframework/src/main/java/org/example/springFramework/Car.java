package org.example.springFramework;
public class Car  {
    int model=2;
    private Vehicle vehicle;


    public  Car(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
    public void start(){
        System.out.println("Bike is running");
    }
}
