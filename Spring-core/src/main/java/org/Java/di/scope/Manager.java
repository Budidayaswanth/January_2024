package org.Java.di.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "org.Java.di.scope")
public class Manager {
    public static void main(String[] args) {
        ApplicationContext context1 =new AnnotationConfigApplicationContext(Manager.class);
        ApplicationContext context2 =new AnnotationConfigApplicationContext(Manager.class);

        TaskManager taskManager1 =context1.getBean(TaskManager.class);
        TaskManager taskManager2 =context1.getBean(TaskManager.class);

        System.out.println(taskManager1);
        System.out.println(taskManager2);

        TaskManager taskManager3 =context2.getBean(TaskManager.class);
        TaskManager taskManager4 =context2.getBean(TaskManager.class);

        System.out.println(taskManager3);
        System.out.println(taskManager4);
    }
}
