package org.example.studentTeacherBeanType;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("child")
@Scope("prototype")
public class Child implements TaskService {
    String name;
    int age;

    @PostConstruct
    public void init(){
        System.out.println("org.example.studentTeacherBeanType.Child details");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Not going to display anyways");
    }

    @Override
    public void updateAge(int age) {
        this.age = age;
    }

    public void updateName(String name) {
        this.name=name;
    }

    @Override
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
