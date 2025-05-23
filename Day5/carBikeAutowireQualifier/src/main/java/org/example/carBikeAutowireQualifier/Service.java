package org.example.carBikeAutowireQualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Service {

    private Vehicle vehicle;

    @Autowired

    public Service(@Qualifier("bike") Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void startJourney() {
        vehicle.start();
    }
}
