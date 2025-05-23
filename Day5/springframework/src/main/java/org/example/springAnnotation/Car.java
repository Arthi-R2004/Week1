package org.example.springAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("car")
public class Car  {
    int model=2;

    @Autowired
    private Vehicle vehicle;

    public void start(){
        System.out.println("Car is running");
    }
}
