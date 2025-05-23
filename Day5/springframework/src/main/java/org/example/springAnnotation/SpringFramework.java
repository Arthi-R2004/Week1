package org.example.springAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.example.springAnnotation")
public class SpringFramework {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(SpringFramework.class);

        Vehicle obj =context.getBean(Vehicle.class);
        obj.start();
    }
}