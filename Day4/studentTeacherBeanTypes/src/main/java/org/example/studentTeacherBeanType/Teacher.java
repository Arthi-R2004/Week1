package org.example.studentTeacherBeanType;

import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.annotation.PreDestroy;


@Component("teacher")
@Scope("singleton")
public class Teacher implements TaskService {
    String name;
    int age;

    @PostConstruct
    public void init(){
        System.out.println("org.example.studentTeacherBeanType.Teacher Logged in");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("org.example.studentTeacherBeanType.Teacher Logged out");
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
