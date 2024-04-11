package org.Java.di.lifecycle;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.List;
@Service
public class EmployeeService {
    private List<Employee> emplist;

    public void showEmployee(){
        emplist.forEach(System.out::println);
    }
    @PostConstruct
    public void init(){
        emplist =List.of(
                Employee.builder().id(101).name("king").mobile("8989198865").build(),
                Employee.builder().id(102).name("Leo").mobile("7989458532").build(),
                Employee.builder().id(103).name("uma").mobile("9876543210").build(),
                Employee.builder().id(104).name("Charan").mobile("9876543212").build(),
                Employee.builder().id(105).name("Rajesh").mobile("9876543213").build()
        );
    }

    @PreDestroy
    public void clear(){
        System.out.println("Clearing the employee list : ");
        if (emplist !=null){
            emplist =null;
        }
    }

}
