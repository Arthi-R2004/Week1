package org.example.studentTeacherBeanType;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        TaskService t1 = context.getBean("teacher", TaskService.class);
        org.example.studentTeacherBeanType.TaskService t2 = context.getBean("teacher", org.example.studentTeacherBeanType.TaskService.class);
        org.example.studentTeacherBeanType.TaskService c1 = context.getBean("child", org.example.studentTeacherBeanType.TaskService.class);
        org.example.studentTeacherBeanType.TaskService c2 = context.getBean("child", org.example.studentTeacherBeanType.TaskService.class);
        org.example.studentTeacherBeanType.TaskService c3 = context.getBean("child", org.example.studentTeacherBeanType.TaskService.class);

        t1.updateName("John");
        t1.updateAge(35);
        c1.updateName("Amir");
        c1.updateAge(5);
        c2.updateName("Jane");
        c2.updateAge(6);
        c3.updateName("Frank");
        c3.updateAge(5);
        t2.updateName("Razim");
        t2.updateAge(40);

        t1.display();
        c1.display();
        c2.display();
        c3.display();
        t2.display();
    }
}
