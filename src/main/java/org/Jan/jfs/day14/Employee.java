package org.Jan.jfs.day14;

public class Employee {
    private int empno;
    private String ename;
    private double salary;

    public Employee(int empno,String ename,double salary){
        this.empno=empno;
        this.ename=ename;
        this.salary=salary;
    }
    public Employee(int empno,String ename){
        this.empno=empno;
        this.ename=ename;
        this.salary=25000;
    }
    public Employee(int empno){
        this(empno,"yash",2500.0);
    }

    public int getEmpno() {
        return empno;
    }
    public String getEname(){
        return ename;
    }
    public double getSalary(){
        return salary;
    }

    public void setEmpno(int empno){
        this.empno=empno;
    }
    public void setEname(String ename){
        this.ename=ename;
    }
    public void setSalary(double salary){
        this.salary =salary;
    }
    public void showInfo(){
        System.out.println("Employee Number : "+empno);
        System.out.println("Employee Name : "+ename);
        System.out.println("Employee Salary : "+salary);
    }
}
