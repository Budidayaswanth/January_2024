package org.Jan.jfs.oop.constructor;

import org.Jan.jfs.oop.two.E;

public class Employee {
    private int empno;
    private String ename;
    private double salary;
    private String dept;
    private String mobile;
    private String email;

    public Employee(int empno,String ename,double salary){
        this(empno,ename,salary,"N/A");
    }
    public Employee(int empno,String ename,double salary,String dept){
       this(empno,ename,salary,dept,"N/A","N/A");
    }
    public Employee(int empno,String ename,double salary,String dept,String mobile,String email){
        this.empno=empno;
        this.ename=ename;
        this.salary=salary;
        this.dept=dept;
        this.email=email;
        this.mobile=mobile;
    }
    public void showDetails(){
        System.out.println("Employee Number : "+empno);
        System.out.println("Employee Name : "+ename);
        System.out.println("Employee Salary : "+salary);
        System.out.println("Employee department :"+dept);
        System.out.println("Employee Mobile : "+mobile);
        System.out.println("Employee Email : "+ename);
    }
}
