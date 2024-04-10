package org.Java.di.javaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "org.Java.di.javaConfig")
public class EmployeeConfiguration {
    @Bean
    public BinarySearch binarySearch(){
        return new BinarySearch();
    }

    @Bean
    public LinearSearch linearSearch(){
        return new LinearSearch();
    }
    @Bean
    public EmployeeService employeeService(){
        return new EmployeeService(binarySearch());
    }
}
