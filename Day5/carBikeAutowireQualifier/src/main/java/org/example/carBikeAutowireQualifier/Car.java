package org.example.carBikeAutowireQualifier;
import org.springframework.stereotype.Component;


@Component("car")
public class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car is starting...");
    }
}
