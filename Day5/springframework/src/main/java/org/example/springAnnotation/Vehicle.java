package org.example.springAnnotation;

import org.springframework.stereotype.Component;

@Component("vehicle")
public class Vehicle {
    int model=3;
    public void start() {

        System.out.println("Vehicle started: "+model+" wheeler");
    }

    public void setModel(int model) {
        this.model = model;
    }
}
