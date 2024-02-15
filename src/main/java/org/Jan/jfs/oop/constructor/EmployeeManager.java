package org.Jan.jfs.oop.constructor;

import org.Jan.jfs.oop.two.E;

public class EmployeeManager {
    public static void main(String[] args) {
        Employee emp =new Employee(123,"uma",3456.7,"ece","900093455","fvdfxvwfQfwrgrw@gmail.com");
        Employee emp1 =new Employee(321,"ganesh",45765.43,"ee");
        emp1.showDetails();
        System.out.println("-".repeat(55));
        emp.showDetails();
    }
}
