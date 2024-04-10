package org.Java.di.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "org.Java.di.annotation")
public class EmployeeManager {
    public static void main(String[] args) {
        ApplicationContext context =new AnnotationConfigApplicationContext(EmployeeManager.class);
        EmployeeService service =context.getBean("employeeSearch", EmployeeService.class);
        service.searchName("King");
        service.searchName("Yash");
        service.searchName("ganesh");
    }
}
