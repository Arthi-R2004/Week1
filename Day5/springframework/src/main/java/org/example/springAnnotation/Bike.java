package org.example.springAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("bike")
public class Bike {
    int model;

    @Autowired
    private Vehicle vehicle;

    public void setModel(int model) {
        this.model = model;
    }

    public void start(){
        System.out.println("Bike started");
    }
}
