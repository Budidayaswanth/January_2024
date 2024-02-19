package org.Jan.jfs.oop.methods;

public class Employee {
    private final  int empno;
    private final String name;
    private final double salary;

    public Employee(int empno,String name,double salary){
        this.empno=empno;
        this.name=name;
        this.salary=salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empno=" + empno +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    public static void main(String[] args) {
        Employee emp=new Employee(100,"yash",2456.44);
        System.out.println(emp);
        Employee emp1 =new Employee(1001,"King",23345.44);
        System.out.println(emp1);
    }



}
