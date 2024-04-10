package org.Java.di.javaConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EmployeeManager {
    public static void main(String[] args) {
        ApplicationContext context =new AnnotationConfigApplicationContext(EmployeeConfiguration.class);
        EmployeeService service =context.getBean("employeeService",EmployeeService.class);
        service.searchName("King");
        service.searchName("yash");
        service.searchName("mahesh");
    }
}
